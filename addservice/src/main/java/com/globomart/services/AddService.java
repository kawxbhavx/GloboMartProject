package com.globomart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddService {
	
	@Autowired
	ProductsRepository productsRepository;

	@RequestMapping(value = "/api/addproduct", method = RequestMethod.POST)
	public void getProducts(Product product)
	{
		/*
		Product product=new Product();
		product.setName("monitor");
		product.setType("hardware");
		*/
		productsRepository.save(product);
	}

}
