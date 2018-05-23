package ims.sunmoon.presantation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ims.sunmoon.domain.Item;
import ims.sunmoon.service.item.ItemService;

@Controller
@RequestMapping(value = "/item")
public class ItemController {
	@Resource
	private ItemService itemService;

	@RequestMapping(value = "/list")
	public ModelAndView list(Item item, String keyword, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/item/list");
		if ("".equals(keyword) || keyword == null) {
			modelAndView.addObject("listItem", this.itemService.list(item));
		} else {
			modelAndView.addObject("listItem", this.itemService.list(item, keyword));
		}
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/item/add");
		modelAndView.addObject("message", request.getParameter("message"));
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Item item, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/item/add");
		if (this.itemService.list(item).isEmpty()) {
			this.itemService.add(item);
			return new ModelAndView(new RedirectView("/item/list"));
		} else {
			String message = "정보를 등록하는데 오류가 발생하였습니다.";
			modelAndView.addObject("message", message);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/edit/{itemCode}", method = RequestMethod.GET)
	public ModelAndView editGet(@PathVariable String itemCode, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/item/edit");
		modelAndView.addObject("item", this.itemService.view(itemCode));
		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editPost(Item item, HttpServletRequest request) throws Exception {
		itemService.edit(item);
		return new ModelAndView(new RedirectView("/item/list"));
	}

	@RequestMapping(value = "/remove/{itemCode}", method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String itemCode, HttpServletRequest request) throws Exception {
		this.itemService.remove(itemCode);
		return new ModelAndView(new RedirectView("/item/list"));
	}

	@RequestMapping(value = "/view/{itemCode}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable String itemCode, HttpServletRequest request) throws Exception {
		ModelAndView modelAndView = new ModelAndView("/item/view");
		modelAndView.addObject("item", this.itemService.view(itemCode));
		return modelAndView;
	}
}