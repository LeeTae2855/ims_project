package ims.sunmoon.presantation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Document;
import ims.sunmoon.domain.Item;
import ims.sunmoon.domain.WW;
import ims.sunmoon.domain.Warehousing;
import ims.sunmoon.domain.Withdraw;
import ims.sunmoon.service.client.ClientService;
import ims.sunmoon.service.item.ItemService;
import ims.sunmoon.service.warehousing.WarehousingService;
import ims.sunmoon.service.withdraw.WithdrawService;
import ims.sunmoon.service.ww.WWService;

@Controller
@RequestMapping(value = "/ww")
public class WWController {
	@Resource
	private WWService wwService;
	@Resource
	private WarehousingService warehousingService;
	@Resource
	private WithdrawService withdrawService;
	@Resource
	private ItemService itemService;
	@Resource
	private ClientService clientService;

	@RequestMapping(value = "/list")
	public ModelAndView list(WW ww, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/list");
		List<WW> listWw = new ArrayList<WW>();
		List<WW> list = null;

		String keyword = ww.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			if ((ww.getFirst() != null) && (ww.getLast() != null)) {
				list = this.wwService.list(ww.getFirst(), ww.getLast());
			} else {
				list = this.wwService.list(ww);
			}
		} else {
			list = this.wwService.list(ww, keyword);
		}

		Iterator<WW> iterator = list.iterator();
		while (iterator.hasNext()) {
			WW resultWw = iterator.next();
			Warehousing resultWare = this.warehousingService.view(resultWw.getWareNo().toString());
			Withdraw resultWith = this.withdrawService.view(resultWw.getWithNo().toString());

			resultWw.setItemName(this.itemService.view(resultWare.getItemNo()).getItemName());
			resultWw.setClientName(this.clientService.view(resultWith.getClientNo().toString()).getClientName());

			listWw.add(resultWw);
		}

		modelAndView.addObject("listWW", listWw);
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(WW ww, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(WW ww, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/add");

		if (this.wwService.list(ww).isEmpty()) {
			this.wwService.add(ww);
			return new ModelAndView(new RedirectView("/ww/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{wwNo}", method = RequestMethod.GET)
	public ModelAndView editGet(WW ww, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/edit");
		modelAndView.addObject("ww", this.wwService.view(ww));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(WW ww, HttpServletRequest request) throws Exception {
		this.wwService.edit(ww);

		return new ModelAndView(new RedirectView("/ww/list"));
	}

	@RequestMapping(value = "/remove/{wwNo}", method = RequestMethod.GET)
	public ModelAndView removeGet(String wwNo, HttpServletRequest request) throws Exception {
		this.wwService.remove(wwNo);

		return new ModelAndView(new RedirectView("/ww/list"));
	}

	@RequestMapping(value = "/doc/{wwNo}")
	public ModelAndView docView(@PathVariable String wwNo) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/doc");

		WW ww = this.wwService.view(wwNo);
		Warehousing ware = this.warehousingService.view(ww.getWareNo().toString());
		Item item = this.itemService.view(ware.getItemNo());
		Withdraw with = this.withdrawService.view(ww.getWithNo().toString());

		Document doc = new Document();
		doc.setWw(ww);
		doc.setWare(ware);
		doc.setItem(item);
		doc.setWith(with);

		modelAndView.addObject("doc", doc);
		return modelAndView;
	}
}