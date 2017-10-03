package com.pryanichnikov.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity(name="employee")
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String surname;
	private String position;
	private String department;
	private Date birthDay;
	private Date recruitment;
	private Date dismissal;
	private int salary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Date getRecruitment() {
		return recruitment;
	}

	public void setRecruitment(Date recruitment) {
		this.recruitment = recruitment;
	}

	public Date getDismissal() {
		return dismissal;
	}

	public void setDismissal(Date dismissal) {
		this.dismissal = dismissal;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
