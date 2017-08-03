package com.jasleen.udacity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LexicographicalOrder {
	public static void lexicographicalSorting() {
		String str1 = "0";
		String str2 = "A";
		String str3 = "a";
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str3.compareTo(str1));
		System.out.println(str3.compareTo(str2));
	}

	/**
	 * Determine if the string comes after "Udacity" in lexicographic order
	 * 
	 * @param string1
	 *            the first string
	 * @return true if string1 comes after "Udacity' in lexicographic order.
	 *         Otherwise return false
	 */
	public boolean comesAfter(String string1) {
		String str = "Udacity";
		if (str.compareTo(string1) > 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("lesson1");
		list.add("lesson2");
		list.add("lesson10");
		
	/*	for(String item : list){
			System.out.println("item : "+item);
		}
	*/	
/*		for(int i=0;i<list.size();i++){
//			System.out.println("item : "+list.get(i));
			if(list.get(i).compareTo(list.get(i+1))>0){
				System.out.println(list.get(i) +" comes after "+ (list.get(i+1)));
			}
			else if (list.get(i).compareTo(list.get(i+1))<0){
				System.out.println(list.get(i) +" comes before "+ (list.get(i+1)));
			}
			else if(list.get(i).compareTo(list.get(i+1))==0){
				System.out.println(list.get(i) +" is equal to "+ (list.get(i+1)));
			}
		}*/
		
/*		Iterator<String> listIterator = list.iterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
			for(int i=0;i<list.size();i++){
				if(list.get(i).compareTo(list.get(i+1))>0){
					System.out.println(list.get(i) +" comes after "+ (list.get(i+1)));
				}
				else if (list.get(i).compareTo(list.get(i+1))<0){
					System.out.println(list.get(i) +" comes before "+ (list.get(i+1)));
				}
				else if(list.get(i).compareTo(list.get(i+1))==0){
					System.out.println(list.get(i) +" is equal to "+ (list.get(i+1)));
				}
			}
		}
		*/
		
		
		list.forEach(
			(temp)->{
				System.out.println(temp);
		});
		}
	}
