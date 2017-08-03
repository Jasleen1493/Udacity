package com.jasleen.map;
import java.util.HashMap;
import java.util.Map;

import com.jasleen.entity.PowerSupply;

public class MapLogic {

	public static void main(String[] args) {
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		MapLogic object1 = new MapLogic();
		map.put(1, object1);
		map.put(2, "String1");
		PowerSupply object2 = new PowerSupply();
		map.put(3, object2);
		

		for (@SuppressWarnings("rawtypes")
		Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
