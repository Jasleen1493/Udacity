package com.jasleen.java8;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Collection {
	
	static List<Apple> inventory = new ArrayList<>();
	
	public static void main(String[] args) {
		//Collections.sort(inventory,new Comparator<Apple>() {
		//public int compare(Apple a1, Apple a2){
		//	return a1.getWeight().compareTo(a2.getWeight());
		//}
		//});
	}
}

@Getter
class Apple{
	
	private Float weight;
	
}