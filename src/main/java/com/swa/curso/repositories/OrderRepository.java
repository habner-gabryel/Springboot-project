package com.swa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swa.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
