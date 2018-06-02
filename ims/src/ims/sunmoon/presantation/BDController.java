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

import ims.sunmoon.domain.BD;
import ims.sunmoon.domain.Bereleased;
import ims.sunmoon.domain.Client;
import ims.sunmoon.domain.Deposit;
import ims.sunmoon.domain.Document;
import ims.sunmoon.domain.Item;
import ims.sunmoon.domain.Manager;
import ims.sunmoon.service.bd.BDService;
import ims.sunmoon.service.bereleased.BereleasedService;
import ims.sunmoon.service.client.ClientService;
import ims.sunmoon.service.deposit.DepositService;
import ims.sunmoon.service.item.ItemService;
import ims.sunmoon.service.manager.ManagerService;

@Controller
@RequestMapping(value = "/bd")
public class BDController {
	@Resource
	private BDService bdService;
	@Resource
	private BereleasedService bereleasedService;
	@Resource
	private ItemService itemService;
	@Resource
	private DepositService depositService;
	@Resource
	private ClientService clientService;
	@Resource
	private ManagerService managerService;

	@RequestMapping(value = "/list")
	public ModelAndView list(BD bd, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/list");
		List<BD> listBd = new ArrayList<BD>();
		List<BD> list = null;

		String keyword = bd.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			if ((bd.getFirst() != null) && (bd.getLast() != null)) {
				list = this.bdService.list(bd.getFirst(), bd.getLast());
			} else {
				list = this.bdService.list(bd);
			}
		} else {
			list = this.bdService.list(bd, keyword);
		}

		Iterator<BD> iterator = list.iterator();
		while (iterator.hasNext()) {
			BD resultBd = iterator.next();
			Bereleased resultBe = this.bereleasedService.view(resultBd.getBeNo().toString());
			Deposit resultDep = this.depositService.view(resultBd.getDepNo().toString());

			resultBd.setItemName(this.itemService.view(resultBe.getItemNo()).getItemName());
			resultBd.setClientName(this.clientService.view(resultDep.getClientNo().toString()).getClientName());

			listBd.add(resultBd);
		}

		modelAndView.addObject("listBD", listBd);
		return modelAndView;
	}

	@RequestMapping(value = "/add/{beNo}", method = RequestMethod.GET)
	public ModelAndView addGet(@PathVariable String beNo, HttpServletRequest request) throws Exception {
		Bereleased be = this.bereleasedService.view(beNo);

		ModelAndView modelAndView = new ModelAndView("/bd/add");
		modelAndView.addObject("message", request.getParameter("message"));
		modelAndView.addObject("be", be);

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(BD bd, Deposit deposit, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/add");

		if (this.bdService.list(bd).isEmpty()) {
			this.depositService.add(deposit);
			bd.setDepNo(deposit.getDepNo());
			this.bdService.add(bd);
			return new ModelAndView(new RedirectView("/bd/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{bdNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String bdNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/edit");
		modelAndView.addObject("bd", this.bdService.view(bdNo));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(BD bd, Deposit deposit, HttpServletRequest request) throws Exception {
		this.depositService.edit(deposit);
		this.bdService.edit(bd);

		return new ModelAndView(new RedirectView("/bd/list"));
	}

	@RequestMapping(value = "/remove/{bdNo}", method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String bdNo, HttpServletRequest request) throws Exception {
		this.bdService.remove(bdNo);

		return new ModelAndView(new RedirectView("/bd/list"));
	}

	@RequestMapping(value = "/view/{accountNo}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable String bdNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/view");
		modelAndView.addObject("bd", this.bdService.view(bdNo));

		return modelAndView;
	}

	@RequestMapping(value = "/doc/{bdNo}")
	public ModelAndView docView(@PathVariable String bdNo) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/doc");

		BD bd = this.bdService.view(bdNo);
		Bereleased be = this.bereleasedService.view(bd.getBeNo().toString());
		Item item = this.itemService.view(be.getItemNo());
		Deposit dep = this.depositService.view(bd.getDepNo().toString());
		Client client = this.clientService.view(dep.getClientNo().toString());
		Manager manager = this.managerService.view(client.getManagerNo().toString());

		Document doc = new Document();
		doc.setBd(bd);
		doc.setBe(be);
		doc.setItem(item);
		doc.setDep(dep);
		doc.setClient(client);
		doc.setManager(manager);

		modelAndView.addObject("doc", doc);
		return modelAndView;
	}
}