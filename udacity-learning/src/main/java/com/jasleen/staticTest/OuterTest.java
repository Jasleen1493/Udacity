package com.jasleen.staticTest;

public class OuterTest {

	private int field1 = 10;
	private static int field2 = 20;

	public void outerMethod(int fieldVlaue1,int fieldVlaue2){
		field1 = fieldVlaue1;
		field2 = fieldVlaue2;
	}

	public static class StaticNestedTest{
		private int nestedFieldl;
		private static int nestedField2;
		
		public void fieldChangeFromStaticNestedClass(){
			//field1 = 100; Non Static member cannot be accessed from static nested class
			field2 = 200;
			System.out.println("Static nested class, field 2 :" +field2);
		}
	}
	
	public class InnerClass{
		
		public void fieldChangeFromInnerClass(){
			field1 = 100;
			outerMethod(1000, 2000);
			System.out.println("Inner class, field 1 :" +field1);
			System.out.println("Inner class, field 2 :" +field2);
		}
		
	}
	public static void main(String[] args) {
		OuterTest outerTest = new OuterTest();
		InnerClass innerClass = new OuterTest().new InnerClass();
		innerClass.fieldChangeFromInnerClass();
		OuterTest.StaticNestedTest staticNestedTest = new OuterTest.StaticNestedTest();
		staticNestedTest.fieldChangeFromStaticNestedClass();
	}

}
