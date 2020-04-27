package org.cap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.cap.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements IProductDao {

	 private EntityManager entityManager;
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Product> findAll() {
		 String jql = "from Product";
	        TypedQuery<Product> query = entityManager.createQuery(jql, Product.class);
	        List<Product> list = query.getResultList();
	        return list;
	}

	@Override
	public Product add(Product product) {
		product=entityManager.merge(product);
		return product;
	}

	@Override
	public Product findById(int id) {
	Product	product =entityManager.find(Product.class,id);
		return product ;
	}

	@Override
	public Product remove(int id) {
		Product	product =entityManager.find(Product.class,id);
		entityManager.remove(product);
		return product;
	}

	@Override
	public Product modify(int id,String name,int price) {
	
		Product product=new Product();
		product.setProductId(id);
		product.setProductName(name);
		product.setProductPrice(price);
		product=entityManager.merge(product);
		return product;
	}

}
