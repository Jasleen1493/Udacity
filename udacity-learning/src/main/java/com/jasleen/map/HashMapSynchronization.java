package com.jasleen.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapSynchronization {
public static void main(String[] args) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("1","entry1");
	map.put("2","entry2");
	map.put(null,"entry3");
	map.put(null,"entry4");
	
	List<String> keys = new ArrayList<String>();
	
	String map1=map.get("1");
	System.out.println("Retrieval :" +map1);
	
	
	Map<String, String> syncMap = Collections.synchronizedMap(map);
	System.out.println("Normal map : " +map);
	System.out.println("Synchronized map : " +syncMap);
	
	
	for (String key : keys)
		System.out.println("Map keys :" +key);
		
}	
}
