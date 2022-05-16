package com.tns.placement_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.placement_management_system.entities.Placement;


public interface PlacementRepository extends JpaRepository<Placement, Integer>{

}
