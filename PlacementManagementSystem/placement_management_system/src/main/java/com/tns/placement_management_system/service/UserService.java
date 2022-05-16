package com.tns.placement_management_system.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.placement_management_system.entities.User;
import com.tns.placement_management_system.repository.UserRepository;



@Service
@Transactional
public class UserService {
	
	@Autowired
	 private UserRepository repo;
	 
	 public List<User> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(User user) 
	 {
	 repo.save(user);
	 }
	 
	 public User get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }

}
