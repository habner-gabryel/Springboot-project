package com.swa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swa.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
