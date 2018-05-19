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

import ims.sunmoon.service.account.AccountService;
import ims.sunmoon.util.option.find.AccountFindOption;
import ims.sunmoon.util.option.sort.AccountSortOption;
import ims.sunmoon.domain.Account;

@Controller
@RequestMapping(value = "/account")
public class AccountController {
	@Resource
	private AccountService accountService;

	@RequestMapping(value = "/list")
	public ModelAndView listGet(HttpServletRequest request) throws Exception {
		Account find = new Account();
		find.setUseable(1);
		List<Account> listAccount = accountService.list(find);

		ModelAndView modelAndView = new ModelAndView("/account/list");
		modelAndView.addObject("listAccount", listAccount);

		return modelAndView;
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ModelAndView listPost(AccountFindOption findOption, AccountSortOption sortOption, String keyword, HttpServletRequest request) throws Exception {
		Account find = new Account();
		find.setUseable(1);
		find.setAccountSortOption(sortOption);
		
		switch (findOption) {
		case NO:
			find.setAccountNo(Integer.parseInt(keyword));
			break;
		case NAME:
			find.setAccountName(keyword);
			break;
		case BANK_NAME:
			find.setBankName(keyword);
			break;
		case CFC:
			find.setAccountCfc(keyword);
			break;
		}
		
		List<Account> listAccount = accountService.list(find);

		ModelAndView modelAndView = new ModelAndView("/account/list");
		modelAndView.addObject("listAccount", listAccount);

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		return new ModelAndView("/account/add");
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Account account, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/account/add");

		if (this.accountService.list(account).isEmpty()) {
			this.accountService.add(account);
			return new ModelAndView(new RedirectView("/account/list"));
		} else {
			String message = "해당 계좌가 이미 등록되어 있거나 잘못된 계좌번호를 입력하셨습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{accountNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String accountNo, HttpServletRequest request) throws Exception {
		Account find = new Account();
		find.setAccountNo(Integer.parseInt(accountNo));
		
		Account result = new Account();
		result.CopyData(this.accountService.view(find));

		ModelAndView modelAndView = new ModelAndView("/account/edit");
		modelAndView.addObject("account", result);

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Account account, HttpServletRequest request) throws Exception {
		accountService.edit(account);
		
		return new ModelAndView(new RedirectView("/account/list"));
	}

	@RequestMapping(value = "/remove/{accountNo}", method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String accountNo, HttpServletRequest request) throws Exception {
		this.accountService.remove(accountNo);
		
		return new ModelAndView(new RedirectView("/account/list"));
	}

	@RequestMapping(value = "/view/{accountNo}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable String accountNo, HttpServletRequest request) throws Exception {
		Account find = new Account();
		find.setAccountNo(Integer.parseInt(accountNo));
		
		Account result = new Account();
		result.CopyData(this.accountService.view(find));

		ModelAndView modelAndView = new ModelAndView("/account/view");
		modelAndView.addObject("account", result);

		return modelAndView;
	}
}