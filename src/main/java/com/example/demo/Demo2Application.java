package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {
	
	
	
	public void adddata(String data) {
		
		
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		
		
	
		
	
	
	 	
	}

}
