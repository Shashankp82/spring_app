package com.example.docker.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAppApplication {


	@RequestMapping("/")
   	 public String home() {
        	return "Dockerizing Spring Boot Application";
    	}

	@RequestMapping("/login")
         public String login() {
                return "<h1>This is where you will see the login page<h1>";
        }

	@RequestMapping("/logout")
         public String logout() {
                return "<h1>This is where you will see the logout page<h1>";
        }


	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
