package ims.sunmoon.presantation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ims.sunmoon.domain.Withdraw;
import ims.sunmoon.service.withdraw.WithdrawService;

@Controller
@RequestMapping(value = "/with")
public class WithdrawController {
	@Resource
	private WithdrawService withdrawService;

	// TODO: 입/출금 및 매입/매출 및 발주/수주 보고서 조회 구현
	// TODO: Withdraw 컨트롤러 로직 구현하기
	@RequestMapping(value = "/list")
	public ModelAndView list(Withdraw withdraw, HttpServletRequest request) throws Exception {
		String keyword = withdraw.getKeyword();
		
		return null;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		return null;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Withdraw withdraw, HttpServletRequest request) throws Exception {
		return null;
	}

	@RequestMapping(value = "/edit/{withNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String withNo, HttpServletRequest request) throws Exception {
		return null;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editGet(Withdraw withdraw, HttpServletRequest request) throws Exception {
		return null;
	}

	@RequestMapping(value = "/remove/{withNo}")
	public ModelAndView remove(String withNo, HttpServletRequest request) throws Exception {
		return null;
	}
}
