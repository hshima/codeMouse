package br.com.codeMouse.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.codeMouse.loja.model.Product;

/*
 * @Repository annotation marks a Class as reference for communication between  
 *  the program and the database
 */
@Repository
public class ProductDAO {

	/*
	 * @PersistenceContext annotation allows an Entity manager object to persist data 
	 * through persistence method via injection  
	 */
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Product product) {
		manager.persist(product);
		
	}
}
