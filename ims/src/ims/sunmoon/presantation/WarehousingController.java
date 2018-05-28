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

import ims.sunmoon.domain.Warehousing;
import ims.sunmoon.service.warehousing.WarehousingService;

@Controller
public class WarehousingController {
	@Resource
	private WarehousingService warehousingService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Warehousing warehousing, String keyword, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ware/list");
		List<Warehousing> find = null;

		if (("".equals(keyword)) || (keyword == null)) {
			if ((warehousing.getFirst() != null) && (warehousing.getLast() != null)) {
				find = this.warehousingService.list(warehousing.getFirst(), warehousing.getLast());
			} else {
				find = this.warehousingService.list(warehousing);
			}
		} else {
			find = this.warehousingService.list(warehousing, keyword);
		}

		modelAndView.addObject("listBe", find);
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ware/list");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Warehousing warehousing, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = null;

		if (this.warehousingService.list(warehousing).isEmpty()) {
			this.warehousingService.add(warehousing);
			modelAndView = new ModelAndView("/ware/list");
		} else {
			modelAndView = new ModelAndView(new RedirectView("/ware/add"));
			modelAndView.addObject("message", "정보를 등록하는데 실패하였습니다.");
		}

		return modelAndView;
	}

	@RequestMapping(value = "/edit/{wareNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String wareNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ware/edit");
		modelAndView.addObject("warehousing", this.warehousingService.view(wareNo));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Warehousing warehousing, HttpServletRequest request) throws Exception {
		this.warehousingService.edit(warehousing);

		return new ModelAndView(new RedirectView("/ware/list"));
	}

	@RequestMapping(value = "/remove/{wareNo}", method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String wareNo, HttpServletRequest request) throws Exception {
		this.warehousingService.remove(wareNo);

		return new ModelAndView(new RedirectView("/ware/list"));
	}
}
