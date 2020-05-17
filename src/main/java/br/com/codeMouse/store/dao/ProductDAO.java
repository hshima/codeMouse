package br.com.codeMouse.store.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.codeMouse.store.model.Product;

/*
 * @Repository annotation marks a Class as reference for communication between  
 *  the program and the database
 */
@Repository 
@Transactional //Indicates to Spring that the DAO needs to be transacted
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
	
	public List<Product> list() {
		return manager.createQuery("SELECT p FROM Product p", Product.class)
				.getResultList(); // Retrieves all the itens of type Product from table Product
	}
}
