package com.jasleen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories
@SpringBootApplication
public class XebiaApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(XebiaApplication.class, args);
	}
}
