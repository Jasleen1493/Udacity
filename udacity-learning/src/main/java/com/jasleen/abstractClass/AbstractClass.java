package com.jasleen.abstractClass;

public abstract class AbstractClass {

	private String method1(){ return "Normal Method";}
	
	abstract public String method2();
	
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		System.out.println("Subclass " + obj.method2());
		System.out.println("AbstractSuperClass " +obj.method1());
	}
}

class SubClass extends AbstractClass {

	public String method1(){
		return "Normal method of SubClass";
	}
	
	@Override
	public String method2() {
		return "Abstract Method";
	}

	
}
