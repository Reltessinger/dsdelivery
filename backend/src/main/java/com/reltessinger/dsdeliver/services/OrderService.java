package com.reltessinger.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reltessinger.dsdeliver.dto.OrderDTO;
import com.reltessinger.dsdeliver.entities.Order;
import com.reltessinger.dsdeliver.repositories.OrderRepository;

 @Service
public class OrderService {
	
	 @Autowired
	 private OrderRepository orderRepository;
	 
	 @Transactional(readOnly = true)
	 public List<OrderDTO> findAll(){
		 List<Order> allProducts = orderRepository.findOrdersWithProducts();
		 return allProducts.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	 }
}
