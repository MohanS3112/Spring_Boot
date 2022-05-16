package com.tns.placement_management_system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class College {
	
	public College() {

	}

	public College(Integer id, String collegeName, String collegeAdmin, String location) {
		this.id = id;
		this.collegeName = collegeName;
		this.collegeAdmin = collegeAdmin;
		this.location = location;
	}

	private Integer id;
	private String collegeName;
	private String collegeAdmin;
	private String location;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", collegeName=" + collegeName + ", collegeAdmin=" + collegeAdmin + ", location="
				+ location + "]";
	}

}
