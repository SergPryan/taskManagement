package com.pryanichnikov.model;

import java.util.Set;

import javax.persistence.*;

@Entity(name="project")
public class Project {
	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(mappedBy = "project")
	private Set<Task> listTask;

	@OneToOne
	private Client client;

	private String name;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Task> getListTask() {
		return listTask;
	}

	public void setListTask(Set<Task> listTask) {
		this.listTask = listTask;
	}
}
