package com.tcs.map.demo;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
	public static void main(String[] args) {
		createHashMap();
	}

	private static void createHashMap() {
		// TODO Auto-generated method stub
		Map<String, Student> mathScores = new HashMap<>();
		for (int i = 0; i < 20; i++) {
			mathScores.put("student" + i, new Student(new Float(100 * Math.random()), new Float(100 * Math.random()),
					new Float(100 * Math.random())));
		}

		System.out.println(mathScores);
	}
}