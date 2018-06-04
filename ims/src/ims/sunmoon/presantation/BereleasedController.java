package ims.sunmoon.presantation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Bereleased;
import ims.sunmoon.service.bereleased.BereleasedService;
import ims.sunmoon.service.item.ItemService;

@Controller
@RequestMapping(value = "/be")
public class BereleasedController {
	@Resource
	private BereleasedService bereleasedService;
	@Resource
	private ItemService itemService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Bereleased bereleased, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/be/list");
		List<Bereleased> listBe = new ArrayList<Bereleased>();
		List<Bereleased> list = null;

		String keyword = bereleased.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			if ((bereleased.getFirst() != null) && (bereleased.getLast() != null)) {
				list = this.bereleasedService.list(bereleased.getFirst(), bereleased.getLast());
			} else {
				list = this.bereleasedService.list(bereleased);
			}
		} else {
			list = this.bereleasedService.list(bereleased, keyword);
		}

		Iterator<Bereleased> iterator = list.iterator();
		while (iterator.hasNext()) {
			Bereleased resultBe = iterator.next();
			resultBe.setItemName(this.itemService.view(resultBe.getItemNo()).getItemName());

			listBe.add(resultBe);
		}

		modelAndView.addObject("listBe", listBe);
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/be/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Bereleased bereleased, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/be/add");

		if (this.bereleasedService.list(bereleased).isEmpty()) {
			this.bereleasedService.add(bereleased);
			return new ModelAndView(new RedirectView("/be/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{beNo}", method = RequestMethod.GET)
	public ModelAndView editGet(Bereleased bereleased, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/be/edit");
		modelAndView.addObject("bereleased", this.bereleasedService.view(bereleased));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Bereleased bereleased, HttpServletRequest request) throws Exception {
		this.bereleasedService.edit(bereleased);

		return new ModelAndView(new RedirectView("/be/list"));
	}

	@RequestMapping(value = "/remove/{beNo}", method = RequestMethod.GET)
	public ModelAndView remove(String beNo, HttpServletRequest request) throws Exception {
		this.bereleasedService.remove(beNo);

		return new ModelAndView(new RedirectView("/be/list"));
	}
	
	@RequestMapping(value ="/popup")
	public ModelAndView popup(Bereleased bereleased) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/be/popup");
		List<Bereleased> listBe = new ArrayList<Bereleased>();
		List<Bereleased> list = null;

		String keyword = bereleased.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			if ((bereleased.getFirst() != null) && (bereleased.getLast() != null)) {
				list = this.bereleasedService.list(bereleased.getFirst(), bereleased.getLast());
			} else {
				list = this.bereleasedService.list(bereleased);
			}
		} else {
			list = this.bereleasedService.list(bereleased, keyword);
		}

		Iterator<Bereleased> iterator = list.iterator();
		while (iterator.hasNext()) {
			Bereleased resultBe = iterator.next();
			resultBe.setItemName(this.itemService.view(resultBe.getItemNo()).getItemName());

			listBe.add(resultBe);
		}

		modelAndView.addObject("listBe", listBe);
		return modelAndView;
	}
}