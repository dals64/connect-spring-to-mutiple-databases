package com.itns.test;

import com.itns.test.models.First;
import com.itns.test.models.Second;
import com.itns.test.repositories.primary.FirstRepository;
import com.itns.test.repositories.secondary.SecondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticationApplication {


	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}


}
