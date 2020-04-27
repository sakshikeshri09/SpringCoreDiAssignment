package org.cap.dao;

import java.util.List;

import org.cap.entities.Product;

public interface IProductDao {

	List<Product> findAll();
	
	Product add(Product product);
	
	Product findById(int id);
	
	Product remove(int id);
	
	Product modify(int id,String name,int price);
	 
}
