package com.tns.placement_management_system.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.placement_management_system.entities.Student;
import com.tns.placement_management_system.repository.StudentRepository;




@Service
@Transactional
public class StudentService {
	
	@Autowired
	 private StudentRepository repo;
	 
	 public List<Student> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Student student) 
	 {
	 repo.save(student);
	 }
	 
	 public Student get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }

}
