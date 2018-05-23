package ims.sunmoon.presantation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Bereleased;
import ims.sunmoon.service.bereleased.BereleasedService;

@Controller
@RequestMapping(value = "/be")
public class BereleasedController {
	@Resource
	private BereleasedService bereleasedService;

	@RequestMapping(value = "/be/list", method = RequestMethod.GET)
	public ModelAndView listGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/be/list");
		modelAndView.addObject("listBe", this.bereleasedService.list(new Bereleased()));
		return modelAndView;
	}

	@RequestMapping(value = "/be/list", method = RequestMethod.POST)
	public ModelAndView listPost(Bereleased bereleased, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/be/list");
		modelAndView.addObject("listBe", this.bereleasedService.list(bereleased));
		return modelAndView;
	}

	@RequestMapping(value = "/be/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		return new ModelAndView("/be/add");
	}

	@RequestMapping(value = "/be/add", method = RequestMethod.POST)
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

	@RequestMapping(value = "/be/edit/{beNo}", method = RequestMethod.GET)
	public ModelAndView editGet(Bereleased bereleased, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/be/edit");
		modelAndView.addObject("bereleased", this.bereleasedService.view(bereleased));
		return modelAndView;
	}

	@RequestMapping(value = "/be/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Bereleased bereleased, HttpServletRequest request) throws Exception {
		this.bereleasedService.edit(bereleased);
		return new ModelAndView(new RedirectView("/be/list"));
	}

	@RequestMapping(value = "/be/remove/{beNo}", method = RequestMethod.GET)
	public ModelAndView remove(String beNo, HttpServletRequest request) throws Exception {
		this.bereleasedService.remove(beNo);
		return new ModelAndView(new RedirectView("/be/list"));
	}
}