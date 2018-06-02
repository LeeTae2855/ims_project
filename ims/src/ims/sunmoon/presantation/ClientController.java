package ims.sunmoon.presantation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Client;
import ims.sunmoon.service.client.ClientService;

@Controller
@RequestMapping(value = "/client")
public class ClientController {
	@Resource
	private ClientService clientService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Client client, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/client/list");

		String keyword = client.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			modelAndView.addObject("listClient", this.clientService.list(client));
		} else {
			modelAndView.addObject("listClient", this.clientService.list(client, keyword));
		}

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/client/add");
		modelAndView.addObject("message", request.getParameter("message"));

		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Client client, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/client/add");

		if (this.clientService.list(client).isEmpty()) {
			this.clientService.add(client);
			return new ModelAndView(new RedirectView("/client/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{clientNo}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String clientNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/client/edit");
		modelAndView.addObject("client", this.clientService.view(clientNo));

		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Client client, HttpServletRequest request) throws Exception {
		this.clientService.edit(client);

		return new ModelAndView(new RedirectView("/client/list"));
	}

	@RequestMapping(value = "/remove/{clientNo}", method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String clientNo, HttpServletRequest request) throws Exception {
		this.clientService.remove(clientNo);

		return new ModelAndView(new RedirectView("/client/list"));
	}

	@RequestMapping(value = "/view/{clientNo}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable String clientNo, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/client/view");
		modelAndView.addObject("client", this.clientService.view(clientNo));

		return modelAndView;
	}

	@RequestMapping(value = "/popup")
	public ModelAndView popup(Client client, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/client/popup");

		String keyword = client.getKeyword();
		if (("".equals(keyword)) || (keyword == null)) {
			modelAndView.addObject("listClient", this.clientService.list(client));
		} else {
			modelAndView.addObject("listClient", this.clientService.list(client, keyword));
		}

		return modelAndView;
	}
}