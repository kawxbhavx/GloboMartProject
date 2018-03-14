package com.globomart.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Product, Long> {

	List<Product> findByType(String type);
}
