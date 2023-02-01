package com.jorgegatica.orderservice.repository;

import com.jorgegatica.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
