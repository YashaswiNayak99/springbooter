package com.example.PostreTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostreTestApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(PostreTestApplication.class, args);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
