package com.pryanichnikov.model;

import javax.persistence.*;

@Entity(name="client")
public class Client {
	
	@Id
	@GeneratedValue
	private Long id;
		
	private String name;
	
	private boolean isLegalEntity;

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

	public boolean isLegalEntity() {
		return isLegalEntity;
	}

	public void setLegalEntity(boolean legalEntity) {
		isLegalEntity = legalEntity;
	}
}
