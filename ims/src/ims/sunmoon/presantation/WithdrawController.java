package ims.sunmoon.presantation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Withdraw;
import ims.sunmoon.service.withdraw.WithdrawService;

@Controller
@RequestMapping(value = "/with")
public class WithdrawController {
	@Resource
	private WithdrawService withdrawService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Withdraw withdraw, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/with/list");

		String keyword = withdraw.getKeyword();
		if ((keyword == null) || ("".equals(keyword))) {
			if ((withdraw.getFirst() != null) && (withdraw.getLast() != null)) {
				modelAndView.addObject("listWith", this.withdrawService.list(withdraw.getFirst(), withdraw.getLast()));
			} else {
				modelAndView.addObject("listWith", this.withdrawService.list(withdraw));
			}
		} else {
			modelAndView.addObject("listWith", this.withdrawService.list(withdraw, withdraw.getKeyword()));
		}

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/with/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Withdraw withdraw, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/with/add");

		if (this.withdrawService.list(withdraw).isEmpty()) {
			this.withdrawService.add(withdraw);
			return new ModelAndView(new RedirectView("/with/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{withNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String withNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/with/edit");
		modelAndView.addObject("withdraw", this.withdrawService.view(withNo));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editGet(Withdraw withdraw, HttpServletRequest request) throws Exception {
		this.withdrawService.edit(withdraw);

		return new ModelAndView(new RedirectView("/with/list"));
	}

	@RequestMapping(value = "/remove/{withNo}", method = RequestMethod.GET)
	public ModelAndView remove(String withNo, HttpServletRequest request) throws Exception {
		this.withdrawService.remove(withNo);

		return new ModelAndView(new RedirectView("/with/list"));
	}
}
