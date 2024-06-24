package com.devreis.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devreis.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
