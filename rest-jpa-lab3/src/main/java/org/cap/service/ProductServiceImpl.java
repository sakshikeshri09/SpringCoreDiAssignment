package org.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.cap.dao.IProductDao;
import org.cap.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

	public IProductDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(IProductDao dao) {
		this.dao = dao;
	}

	IProductDao dao;
	@Override
	public List<Product> findAll() {
		List<Product> product=dao.findAll();
		return product;
	}

	@Override
	public Product add(Product product) {
		 product=dao.add(product);
		return product;
	}

	@Override
	public Product findById(int id) {
		Product product=dao.findById(id);
		return product;
	}

	@Override
	public Product remove(int id) {
	 Product product=	dao.remove(id);
		return product;
	}

	@Override
	public Product modify(int id,String name,int price) {
	Product product=	dao.modify(id, name, price);
		return product;
	}

}
