package com.pryanichnikov.repository;

import com.pryanichnikov.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client,Long> {
}
