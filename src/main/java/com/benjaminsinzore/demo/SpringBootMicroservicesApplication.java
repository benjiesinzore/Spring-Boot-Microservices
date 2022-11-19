package com.benjaminsinzore.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicroservicesApplication {

	public static void main(String[] args) {


		try {

			SpringApplication.run(SpringBootMicroservicesApplication.class, args);
		} catch (Exception ee){
			ee.printStackTrace();
		}
	}

}
