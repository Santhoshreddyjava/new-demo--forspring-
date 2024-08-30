package com.example.demo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		
		
		String s = "naveen";
		
	Map<Object, Long> vb =	s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

	vb.forEach((k,v)->{
		if(v>1) {
			System.out.println(k+":"+v);
		}
	});
	
	 	
	}

}
