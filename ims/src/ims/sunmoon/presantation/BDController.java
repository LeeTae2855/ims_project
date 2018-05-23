package ims.sunmoon.presantation;

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
import ims.sunmoon.service.bd.BDService;

@Controller
@RequestMapping(value = "/bd")
public class BDController {
	@Resource
	private BDService bdService;

	@RequestMapping(value = "/list")
	public ModelAndView listGet(HttpServletRequest request) throws Exception {
		List<BD> listBD = this.bdService.list(new BD());

		ModelAndView modelAndView = new ModelAndView("/bd/list");
		modelAndView.addObject("listBD", listBD);

		return modelAndView;
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ModelAndView listPost(String keyword, HttpServletRequest request) throws Exception {
		List<BD> listBD = this.bdService.list(new BD(), keyword);

		ModelAndView modelAndView = new ModelAndView("/bd/list");
		modelAndView.addObject("listBD", listBD);

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		return new ModelAndView("/bd/add");
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(BD bd, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/bd/add");

		// TODO: bd 등록 예외처리 로직 작성
		if (this.bdService.list(bd).isEmpty()) {
			this.bdService.add(bd);
			return new ModelAndView(new RedirectView("/bd/list"));
		} else {
			String message = "에러 메시지";
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
