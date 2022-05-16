package com.tns.placement_management_system.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.placement_management_system.entities.Placement;
import com.tns.placement_management_system.repository.PlacementRepository;



@Service
@Transactional
public class PlacementService {
	
	@Autowired
	 private PlacementRepository repo;
	 
	 public List<Placement> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Placement placement) 
	 {
	 repo.save(placement);
	 }
	 
	 public Placement get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }

}
