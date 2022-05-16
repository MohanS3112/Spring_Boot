package com.tns.placement_management_system.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.placement_management_system.entities.College;
import com.tns.placement_management_system.service.CollegeService;


@RestController
public class CollegeController {
	
	// Reference variable
		@Autowired
		private CollegeService service;

		// Retrieval operation
		@GetMapping("/college")
		public List<College> list() {
			return service.listAll();
		}

		// Retrieval on the basis of id
		@GetMapping("/college/{id}")
		public ResponseEntity<College> get(@PathVariable Integer id) {
			try {
				College college = service.get(id);
				return new ResponseEntity<College>(college, HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
			}
		}

		// Create Operation
		@PostMapping("/college")
		public void add(@RequestBody College college) {
			service.save(college);
		}

		//// RESTful API method for Update operation
		@PutMapping("/college/{id}")
		public ResponseEntity<College> update(@RequestBody College college, @PathVariable Integer id) {
			try {
				College college1 = service.get(id);
				service.save(college1);
				System.out.println("College details updated");
				return new ResponseEntity<College>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
			}
		}

		// Delete Operation
		@DeleteMapping("/college/{id}")
		public void delete(@PathVariable Integer id) {
			try {
				service.delete(id);
			} catch (NoSuchElementException e) {
				System.out.println("not exist");
			}
		}

}
