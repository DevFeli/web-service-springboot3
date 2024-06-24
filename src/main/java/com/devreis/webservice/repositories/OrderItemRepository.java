package com.devreis.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devreis.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
