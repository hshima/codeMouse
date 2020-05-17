package br.com.codeMouse.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.codeMouse.store.dao.ProductDAO;
import br.com.codeMouse.store.model.PriceType;
import br.com.codeMouse.store.model.Product;

@Controller
@RequestMapping("/products") // receives every request to this endpoint
public class ProductController {

	/*
	 * @Autowired Allows ProductDAO injection in this servlet
	 */
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping("form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("products/form");
		modelAndView.addObject("kinds", PriceType.values());

		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView save(Product product, RedirectAttributes redirectAttributes) {
		System.out.println(product);
//		persists Product object through .save() from ProductDAO's injected Class
		productDAO.save(product);
		redirectAttributes.addFlashAttribute("success", "Product successfully registered"); // passes a request valid
																							// for a single request to
																							// the next HTTP call that
																							// returns a success message
																							// to the JSP

//		return "/products/ok"; // stops returning for the same page and passes by redirect, so method called are always GET and doesn't keeps calling the same post call and adding the same data to the database
		return new ModelAndView("redirect:products");
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		List<Product> products = productDAO.list();
		ModelAndView modelAndView = new ModelAndView("products/list"); // parses a Model object to the view
		modelAndView.addObject("products", products);
		return modelAndView;
	}

}
