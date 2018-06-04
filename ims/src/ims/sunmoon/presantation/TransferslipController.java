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
import ims.sunmoon.domain.Client;
import ims.sunmoon.domain.Document;
import ims.sunmoon.domain.Transferslip;
import ims.sunmoon.service.account.AccountService;
import ims.sunmoon.service.client.ClientService;
import ims.sunmoon.service.transferslip.TransferslipService;

@Controller
@RequestMapping(value = "/ts")
public class TransferslipController {
	@Resource
	private TransferslipService transferslipService;
	@Resource
	private ClientService clientService;
	@Resource
	private AccountService accountService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Transferslip transferslip, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ts/list");

		String keyword = transferslip.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			if ((transferslip.getFirst() != null) && (transferslip.getLast() != null)) {
				modelAndView.addObject("listTs",
						this.transferslipService.list(transferslip.getFirst(), transferslip.getLast()));
			} else {
				modelAndView.addObject("listTs", this.transferslipService.list(transferslip));
			}
		} else {
			modelAndView.addObject("listTs", this.transferslipService.list(transferslip, keyword));
		}

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ts/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Transferslip transferslip, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ts/add");

		if (this.transferslipService.list(transferslip).isEmpty()) {
			if (transferslip.getCreditNo() == transferslip.getDebtorNo()) {
				String message = "차변계좌와 대변계좌는 같을 수 없습니다.";
				modelAndView.addObject("message", message);

				return modelAndView;
			} else {
				this.transferslipService.add(transferslip);

				return new ModelAndView(new RedirectView("/ts/list"));
			}
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);

			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{tsNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String tsNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ts/edit");
		modelAndView.addObject("transferslip", this.transferslipService.view(tsNo));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Transferslip transferslip, HttpServletRequest request) throws Exception {
		this.transferslipService.edit(transferslip);

		return new ModelAndView(new RedirectView("/ts/list"));
	}

	@RequestMapping(value = "/remove/{tsNo}", method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String tsNo, HttpServletRequest request) throws Exception {
		this.transferslipService.remove(tsNo);

		return new ModelAndView(new RedirectView("/ts/list"));
	}

	@RequestMapping(value = "/view/{tsNo}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable String tsNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ts/view");
		modelAndView.addObject("transferslip", this.transferslipService.view(tsNo));

		return modelAndView;
	}

	@RequestMapping(value = "/doc/{tsNo}")
	public ModelAndView docView(@PathVariable String tsNo) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/ts/doc");

		Transferslip ts = this.transferslipService.view(tsNo);
		Client client = this.clientService.view(ts.getClientNo().toString());
		Account account = this.accountService.view(client.getAccountNo().toString());

		Document doc = new Document();
		doc.setTs(ts);
		doc.setClient(client);
		doc.setAccount(account);

		modelAndView.addObject("doc", doc);
		return modelAndView;
	}
}