package org.cap.service;

import java.util.List;

import org.cap.entities.Product;

public interface IProductService {

	List<Product> findAll();
	
	Product add(Product product);
	
	Product findById(int id);
	
	Product remove(int id);
	
	Product modify(int id,String name,int price);
	 
}
