package com.pryanichnikov.model;

import java.util.*;

import javax.persistence.*;

@Entity(name="task")
public class Task {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
    private Date start;
	private Date end;

	@ManyToMany
	private Set<Employee> employeeList = new HashSet<>();

	public Set<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
