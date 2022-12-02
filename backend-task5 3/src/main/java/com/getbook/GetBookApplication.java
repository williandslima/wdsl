package com.getbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class GetBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetBookApplication.class, args);
	}

}
