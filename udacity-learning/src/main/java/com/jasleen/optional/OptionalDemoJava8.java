package com.jasleen.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.jdt.internal.compiler.ast.ForeachStatement;

public class OptionalDemoJava8 {

	public static void main(String[] args) {
	
		Address anyPersonAddress = new Address("52/A, 22nd Street",
                "Mumbai", "India", 400001);
		Person John = new Person("John", Optional.of(anyPersonAddress), 987456321);
		Person Marry = new Person("John", Optional.ofNullable(anyPersonAddress), 987456321);
		Person Tom = new Person("John", Optional.empty(), 987456321);
		
		Map<String,Person> personMap = new HashMap<String, Person>();
		personMap.put("John", John);
		personMap.put("Marry", Marry);
		personMap.put("Tom", Tom);
		
	}
}

