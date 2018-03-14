package com.globomart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoveService {
	
	@Autowired
	ProductsRepository productsRepository;

	@RequestMapping(value = "/api/removeproduct/{id}", method = RequestMethod.DELETE)
	public void removeProduct(@PathVariable Long id)
	{
		productsRepository.delete(id);
	}
}
