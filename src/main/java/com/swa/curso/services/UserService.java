package com.swa.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swa.curso.entities.User;
import com.swa.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User att) {
		User entity = repository.getOne(id);
		updateData(entity, att);
		
		return repository.save(entity);
	}

	private void updateData(User entity, User att) {
		entity.setName(att.getName());
		entity.setEmail(att.getEmail());
		entity.setPhone(att.getPhone());		
	}
}
