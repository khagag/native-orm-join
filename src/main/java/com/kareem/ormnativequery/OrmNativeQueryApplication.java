package com.kareem.ormnativequery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.kareem.ormnativequery.orm")
public class OrmNativeQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmNativeQueryApplication.class, args);
	}

}
