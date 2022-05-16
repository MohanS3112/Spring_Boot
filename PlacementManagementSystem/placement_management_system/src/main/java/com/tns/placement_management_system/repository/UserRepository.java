package com.tns.placement_management_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.placement_management_system.entities.User;



public interface UserRepository extends JpaRepository<User, Integer> {

}
