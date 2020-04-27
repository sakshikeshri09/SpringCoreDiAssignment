package org.cap.controller;

import java.util.List;

import org.cap.dto.ProductDto;
import org.cap.entities.Product;
import org.cap.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@Autowired
	IProductService service;
	
	@PostMapping("product/add")
	public ResponseEntity<Product> addProduct(@RequestBody ProductDto dto)
	{
		Product product=new Product();
		product=convertDto(dto);
		product=service.add(product);
		ResponseEntity<Product> response=new ResponseEntity<Product>(product,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("product/find/{id}")
	public ResponseEntity<Product> findMethod(@PathVariable("id")int id)
	{
		Product product=new Product();
		product=service.findById(id);
		ResponseEntity<Product> response=new ResponseEntity<Product>(product,HttpStatus.OK);
		return response;
	}
	
	
	
	
	@PutMapping("product/modify/{id}")
	public ResponseEntity<Product> modifyProduct(@PathVariable("id") int id,@RequestBody ProductDto dto)
	{
		Product product=new Product();
		//product.setProductId(id);
		product=convertDto(dto);
		product.setProductId(id);
		product=service.modify(product.getProductId(),product.getProductName(),product.getProductPrice());
		ResponseEntity<Product> response=new ResponseEntity<Product>(product, HttpStatus.OK);
		return response;
		
	}
	
	@GetMapping("product/show")
	public ResponseEntity<List<Product>> findAllProduct()
	{
		
		List<Product> list=service.findAll();
		ResponseEntity<List<Product>> response=new ResponseEntity<>(list, HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("product/delete/{id}")
	public ResponseEntity<Product> delMethod(@PathVariable("id")int id)
	{
		Product product=new Product();
		product=service.findById(id);
		product=service.remove(id);
		ResponseEntity<Product> response=new ResponseEntity<Product>(product,HttpStatus.OK);
		return response;
	}
	
	public Product convertDto(ProductDto dto)
	{
		Product product=new Product();
		product.setProductName(dto.getName());
		product.setProductPrice(dto.getPrice());
		return product;
	}
}
