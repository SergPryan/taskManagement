package com.pryanichnikov.commons;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@org.springframework.context.annotation.Configuration
@EnableJpaRepositories("com.pryanichnikov.repository")
@EntityScan("com.pryanichnikov.model")
@ComponentScan("com.pryanichnikov")
public class Configuration {
}
