package com.jasleen.staticTest;

/* 
 * Explored from http://www.geeksforgeeks.org/static-class-in-java/
 */
public class OuterClass {

	private static String message = "Static field";
	private String msg = "Non Static field";

	public void outerClassMethod() {
		System.out.println("Outer class method");
	}

	public void outerClassStaticMethod() {
		System.out.println("Outer class static method");
	}

	/*
	 * @StaticNestedClass : Non static Inner Class
	 * 
	 * @Access : only static fields
	 */
	public static class NestedStaticClass {
		/*
		 * Need to create instance of the outer class to access outer class
		 * members(fields and methods) Hence, high space complexity
		 */
		public void printMessage() {
			OuterClass outerClass = new OuterClass();
			outerClass.outerClassMethod();
			outerClass.outerClassStaticMethod();
			System.out.println("Access from nested static class : " + message);
		}
	}

	/*
	 * @InnerClass : Non static Inner Class
	 * 
	 * @Access : both static and non static fields
	 */
	public class InnerClass {

		/*
		 * No need to create instance of the outer class to access outer class
		 * members(fields and methods) Hence, easy and concise
		 */
		public void printMessage() {
			outerClassMethod();
			outerClassStaticMethod();
			System.out.println("Access from nested non static class : " + message);
			System.out.println("Access from nested non static class : " + msg);
		}
	}

	public static void main(String[] args) {

		// @NoNeedOfOuterClassReference
		OuterClass.NestedStaticClass pClass = new OuterClass.NestedStaticClass();
		pClass.printMessage();

		// @NeedOfOuterClassReference
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.printMessage();

		// @NeedOfOuterClassReference
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.printMessage();
	}
}
