package com.reltessinger.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reltessinger.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
