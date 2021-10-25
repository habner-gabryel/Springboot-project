package com.swa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swa.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
