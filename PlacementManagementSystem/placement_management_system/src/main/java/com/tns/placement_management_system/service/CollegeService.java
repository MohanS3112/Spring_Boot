package com.tns.placement_management_system.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.placement_management_system.entities.College;
import com.tns.placement_management_system.repository.CollegeRepository;


@Service
@Transactional
public class CollegeService {
	
	@Autowired
	private CollegeRepository repo;

	public List<College> listAll() {
		return repo.findAll();
	}

	public College get(Integer id) {
		return repo.findById(id).get();
	}

	public void save(College college) {
		repo.save(college);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
