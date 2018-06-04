package ims.sunmoon.presantation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Account;
import ims.sunmoon.service.account.AccountService;

@Controller
@RequestMapping(value = "/account")
public class AccountController {
	@Resource
	private AccountService accountService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Account account, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/account/list");
		account.setIsowner(1);

		String keyword = account.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			modelAndView.addObject("listAccount", this.accountService.list(account));
		} else {
			modelAndView.addObject("listAccount", this.accountService.list(account, keyword));
		}

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/account/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Account account, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/account/add");

		if (this.accountService.list(account).isEmpty()) {
			this.accountService.add(account);
			return new ModelAndView(new RedirectView("/account/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{accountNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String accountNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/account/edit");
		modelAndView.addObject("account", this.accountService.view(accountNo));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Account account, HttpServletRequest request) throws Exception {
		this.accountService.edit(account);

		return new ModelAndView(new RedirectView("/account/list"));
	}

	@RequestMapping(value = "/remove/{accountNo}", method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String accountNo, HttpServletRequest request) throws Exception {
		this.accountService.remove(accountNo);

		return new ModelAndView(new RedirectView("/account/list"));
	}

	@RequestMapping(value = "/view/{accountNo}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable String accountNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/account/view");
		modelAndView.addObject("account", this.accountService.view(accountNo));

		return modelAndView;
	}

	@RequestMapping(value = "/popup")
	public ModelAndView popup(Account account, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/account/popup");
		account.setIsowner(1);

		String keyword = account.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			modelAndView.addObject("listAccount", this.accountService.list(account));
		} else {
			modelAndView.addObject("listAccount", this.accountService.list(account, keyword));
		}

		return modelAndView;
	}
}