package com.jasleen.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
Java 8 has introduced forEach method in java.lang.Iterable interface so that while writing code we focus on business logic only. forEach method takes java.util.function.Consumer object as argument, so it helps in having our business logic at a separate location that we can reuse.
 */
public class ForEach {
	
	void addElementsToList(List<Integer> list){
/*		 for (int index = 0; index < 10; index++) {
			 list.add(index);
			 while(index < 20)
			 list.add(index+1);
		 }	*/		 
		/*int index =0;
			list.add(index);
			while(list != null){
					index++;
					list.add(index);
		}*/
		for(int index = 0;index<10;index++)
			list.add(index);
	}
	
	List<Integer> removeElementsToList(List<Integer> list){
		List<Integer> modifiedList = new ArrayList<Integer>();
		for (int index = 0; index < list.size(); index = index + 2) {
				int elementRemoved = list.remove(index);
				modifiedList.add(elementRemoved);
			System.out.println("element removed from list : " + list.get(index) + " at " + index + "th position");
		}
		return modifiedList;
	}
	
	void printElementsOfListByTraversing(List<Integer> list){
		// Method 1
		for (int index = 0; index < list.size(); index++) 
			System.out.println(index + 1 + "th element of the list : " + list.get(index));
/*		// Method 2
		Iterator<Integer> item =list.iterator();
		while(item.hasNext()){
			int index = item.next();
			System.out.println(index + 1 + "th element of the list : " + list.get(index));
		}*/
	}
	
	void traverseItemsUsingConsumer(List<Integer> list){
		list.forEach(new Consumer<Integer>(){
			public void accept(Integer t){
				System.out.println("forEach anonymous class Value :: "+t);
			}
		});
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ForEach forEachObj = new ForEach();
		forEachObj.addElementsToList(list);
		forEachObj.traverseItemsUsingConsumer(list);
		//forEachObj.printElementsOfListByTraversing(list);
/*		list = forEachObj.removeElementsToList(list);
		forEachObj.printElementsOfListByTraversing(list);
		*/
		
	}
}
