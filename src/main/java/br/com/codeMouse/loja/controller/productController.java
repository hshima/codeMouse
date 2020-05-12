package br.com.codeMouse.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.codeMouse.loja.dao.ProductDAO;
import br.com.codeMouse.loja.model.Product;

public class productController {
	
	/*
	 * @Autowired Allows ProductDAO injection in this servlet
	 */
	@Autowired
	private ProductDAO productDAO;
	
	public String form() {
		return "product/form";
	}

	@RequestMapping("codeMouse/products")
	public String save(Product product) {
		System.out.println(product);
		/*
		 * persists Product object through .save() from ProductDAO's injected Class 
		 */
		productDAO.save(product);
		return "products/ok";
	}

}
