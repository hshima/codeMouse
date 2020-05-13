package br.com.codeMouse.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.codeMouse.loja.dao.ProductDAO;
import br.com.codeMouse.loja.model.Product;

@Controller
public class productController {
	
	/*
	 * @Autowired Allows ProductDAO injection in this servlet
	 */
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("products/form")
	public String form() {
		return "products/form";
	}

	@RequestMapping("/products")
	public String save(Product product) {
		System.out.println(product);
		/*
		 * persists Product object through .save() from ProductDAO's injected Class 
		 */
		productDAO.save(product);
		return "/products/ok";
	}

}
