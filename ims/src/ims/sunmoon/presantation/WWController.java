package ims.sunmoon.presantation;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.WW;
import ims.sunmoon.service.ww.WWService;

@Controller
@RequestMapping(value = "/ww")
public class WWController {
	@Resource
	private WWService wwService;

	@RequestMapping(value = "/list")
	public ModelAndView list(WW ww, String keyword, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/list");
		List<WW> find = null;

		if ("".equals(keyword) || keyword == null) {
			if (ww.getFirst() != null && ww.getLast() != null) {
				find = this.wwService.list(ww.getFirst(), ww.getLast());
			} else {
				find = this.wwService.list(ww);
			}
		} else {
			find = this.wwService.list(ww, keyword);
		}

		modelAndView.addObject("listAccount", find);
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
}