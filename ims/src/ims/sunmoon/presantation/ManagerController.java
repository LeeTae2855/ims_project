package ims.sunmoon.presantation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Manager;
import ims.sunmoon.service.manager.ManagerService;

@Controller
@RequestMapping(value = "/manager")
public class ManagerController {
	@Resource
	private ManagerService managerService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Manager manager, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/manager/list");

		String keyword = manager.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			modelAndView.addObject("listManager", this.managerService.list(manager));
		} else {
			modelAndView.addObject("listManager", this.managerService.list(manager, keyword));
		}

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/manager/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Manager manager, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/manager/add");

		if (this.managerService.list(manager).isEmpty()) {
			this.managerService.add(manager);
			return new ModelAndView(new RedirectView("/manager/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{managerNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String managerNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/manager/edit");
		modelAndView.addObject("manager", this.managerService.view(managerNo));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Manager manager, HttpServletRequest request) throws Exception {
		this.managerService.edit(manager);

		return new ModelAndView(new RedirectView("/manager/list"));
	}

	@RequestMapping(value = "/remove/{managerNo}", method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String managerNo, HttpServletRequest request) throws Exception {
		this.managerService.remove(managerNo);

		return new ModelAndView(new RedirectView("/manager/list"));
	}

	@RequestMapping(value = "/view/{managerNo}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable String managerNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/manager/view");
		modelAndView.addObject("manager", this.managerService.view(managerNo));

		return modelAndView;
	}

	@RequestMapping(value = "/popup")
	public ModelAndView popup(Manager manager, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/manager/popup");

		String keyword = manager.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			modelAndView.addObject("listManager", this.managerService.list(manager));
		} else {
			modelAndView.addObject("listManager", this.managerService.list(manager, keyword));
		}

		return modelAndView;
	}
}