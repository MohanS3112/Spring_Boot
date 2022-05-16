package com.tns.placement_management_system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Certificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int year;
	private String collegename;
	
	public Certificate() 
	 {
		
	 }
	
	public Certificate(int id, int year, String collegename) {
		super();
		this.id = id;
		this.year = year;
		this.collegename = collegename;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + ", collegename=" + collegename + "]";
	}

}
