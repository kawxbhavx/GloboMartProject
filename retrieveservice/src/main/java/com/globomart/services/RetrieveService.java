package com.globomart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetrieveService {
	
	@Autowired
	ProductsRepository productsRepository;

	@RequestMapping(value = "/api/getproducts/{type}", method = RequestMethod.GET)
	public List<Product> getProducts(@PathVariable String type)
	{
		return productsRepository.findByType(type);
	}
}
