package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EMployee {
	
	public static void main(String[] args) {
		
	
	Map<String , Integer> fg = new HashMap<>();
	fg.put("naveen", 2);
	fg.put("santosh", 4);
	fg.put("priyall", 3);
	fg.put(null, null);
	
	 // Filter out entries where key or value is null
    Map<String, Integer> filteredMap = fg.entrySet().stream()
        .filter(entry -> entry.getKey() != null && entry.getValue() != null) // Fix here
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    
    System.out.println(filteredMap);

	
	
	
	}
	
        

}
