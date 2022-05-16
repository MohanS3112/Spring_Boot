package com.tns.placement_management_system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	public Student() 
	 {
		
	 }

	public Student(Integer id, String name, String collegename, Integer rollno, String qualification, String course,
			Integer year, String certificate, Integer hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.collegename = collegename;
		this.rollno = rollno;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallticketno = hallticketno;
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String collegename;
	
	private Integer rollno;
	

	private String qualification;
	
	private String course;
	
	private Integer year;
	
	private String certificate;
	
	private Integer hallticketno;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public Integer getHallticketno() {
		return hallticketno;
	}

	public void setHallticketno(Integer hallticketno) {
		this.hallticketno = hallticketno;
	}

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collegename=" + collegename + ", rollno=" + rollno
				+ ", qualification=" + qualification + ", course=" + course + ", year=" + year + ", certificate="
				+ certificate + ", hallticketno=" + hallticketno + "]";
	}
}
