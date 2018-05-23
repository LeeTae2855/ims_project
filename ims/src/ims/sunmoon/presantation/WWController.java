package ims.sunmoon.presantation;

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

	@RequestMapping(value = "/ww/list")
	public ModelAndView listGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/list");
		modelAndView.addObject("listWW", this.wwService.list(new WW()));
		return modelAndView;
	}

	@RequestMapping(value = "/ww/list", method = RequestMethod.POST)
	public ModelAndView listPost(WW ww, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/list");
		modelAndView.addObject("listWW", this.wwService.list(ww));
		return modelAndView;
	}

	@RequestMapping(value = "/ww/add", method = RequestMethod.GET)
	public ModelAndView addGet(WW ww, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/add");
		modelAndView.addObject("ww", this.wwService.view(ww));
		return modelAndView;
	}

	@RequestMapping(value = "/ww/add", method = RequestMethod.POST)
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

	@RequestMapping(value = "/ww/edit/{wwNo}", method = RequestMethod.GET)
	public ModelAndView editGet(WW ww, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ww/edit");
		modelAndView.addObject("ww", this.wwService.view(ww));
		return modelAndView;
	}

	@RequestMapping(value = "/ww/edit", method = RequestMethod.POST)
	public ModelAndView editPost(WW ww, HttpServletRequest request) throws Exception {
		this.wwService.edit(ww);
		return new ModelAndView(new RedirectView("/ww/list"));
	}

	@RequestMapping(value = "/ww/remove/{wwNo}", method = RequestMethod.GET)
	public ModelAndView removeGet(String wwNo, HttpServletRequest request) throws Exception {
		this.wwService.remove(wwNo);
		return new ModelAndView(new RedirectView("/ww/list"));
	}
}