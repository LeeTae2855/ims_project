package ims.sunmoon.presantation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.BD;
import ims.sunmoon.service.bd.BDService;

@Controller
@RequestMapping(value = "/bd")
public class BDController {
	@Resource
	private BDService bdService;

	@RequestMapping(value = "/list")
	public ModelAndView list(BD bd, String keyword, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/list");

		if ("".equals(keyword) || keyword == null) {
			if ((bd.getFirst() != null) && (bd.getLast() != null)) {

			}
			modelAndView.addObject("listBD", this.bdService.list(bd));
		} else {
			modelAndView.addObject("listBD", this.bdService.list(bd, keyword));
		}

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(BD bd, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/add");

		if (this.bdService.list(bd).isEmpty()) {
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
	public ModelAndView editPost(BD bd, HttpServletRequest request) throws Exception {
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
}