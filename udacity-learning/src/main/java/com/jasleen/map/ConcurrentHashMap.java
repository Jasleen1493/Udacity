package com.jasleen.map;

import java.util.Map;

public class ConcurrentHashMap {
	public static void main(String[] args) {
		Map<String, String> concurrentMap = new java.util.concurrent.ConcurrentHashMap<String,String>();
		concurrentMap.put(null, "dsfxxg");
		concurrentMap.put("2", "dcsd");
		concurrentMap.put("3", "dssd");
		System.out.println("Concurrent map : " + concurrentMap);

	}
}
