package com.devreis.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devreis.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
