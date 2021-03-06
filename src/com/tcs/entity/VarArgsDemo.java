package com.tcs.entity;

public class VarArgsDemo {
	public static void main(String[] args) {
		String[] subjects = {"Math", "English"};
		Student student = new Student(subjects);
		System.out.println(student.subjects[0]);
		
		Student student1 = new Student("science");
		System.out.println(student1.subjects[0]);
	}
}

class Student{
	String[] subjects;
	
	//can pass only string array
	//public Student(String... subjects) { //VarArgs
	//	this.subjects = subjects;
	//}
	
	public Student(String... subjects) { //VarArgs
		this.subjects = subjects;
	}
}