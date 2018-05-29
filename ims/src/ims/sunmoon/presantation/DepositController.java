package ims.sunmoon.presantation;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Deposit;
import ims.sunmoon.service.deposit.DepositService;

@Controller
@RequestMapping(value = "/dep")
public class DepositController {
	@Resource
	private DepositService depositService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Deposit deposit, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/dep/list");
		List<Deposit> find = null;

		String keyword = deposit.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			if ((deposit.getFirst() != null) && (deposit.getLast() != null)) {
				find = this.depositService.list(deposit.getFirst(), deposit.getLast());
			} else {
				find = this.depositService.list(deposit);
			}
		} else {
			find = this.depositService.list(deposit, keyword);
		}

		modelAndView.addObject("listDep", find);
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/dep/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Deposit deposit, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/dep/add");

		if (this.depositService.list(deposit).isEmpty()) {
			this.depositService.add(deposit);
			return new ModelAndView(new RedirectView("/dep/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{depNo}", method = RequestMethod.GET)
	public ModelAndView editGet(Deposit deposit, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/dep/edit");
		modelAndView.addObject("deposit", this.depositService.view(deposit));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Deposit deposit, HttpServletRequest request) throws Exception {
		this.depositService.edit(deposit);

		return new ModelAndView(new RedirectView("/dep/list"));
	}

	@RequestMapping(value = "/remove/{depNo}", method = RequestMethod.GET)
	public ModelAndView remove(String depNo, HttpServletRequest request) throws Exception {
		this.depositService.remove(depNo);

		return new ModelAndView(new RedirectView("/dep/list"));
	}
}