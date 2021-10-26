package com.swa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swa.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
