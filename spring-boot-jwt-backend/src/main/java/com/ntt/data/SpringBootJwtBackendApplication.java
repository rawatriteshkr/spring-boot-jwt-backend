package com.ntt.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = {
        "com.ntt.data.config",
        "com.ntt.data.controller",
        "com.ntt.data.entity",
        "com.ntt.data.exception",
        "com.ntt.data.filter",
        "com.ntt.data.initializer",
        "com.ntt.data.model",
        "com.ntt.data.repo",
        "com.ntt.data.service",
        "com.ntt.data.util"
    })
public class SpringBootJwtBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtBackendApplication.class, args);
	}

}
