package com.tns.placement_management_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.placement_management_system.entities.Student;



public interface StudentRepository extends JpaRepository<Student, Integer>{

}
