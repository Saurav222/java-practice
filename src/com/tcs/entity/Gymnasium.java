package com.tcs.entity;
import java.util.List;
import java.util.ArrayList;

public class Gymnasium {
	static List<User> users = new ArrayList<User>();
	public static void main(String args[]) {
		createUsers();
	}
	private static void createUsers() {
		for (int i = 0; i<10; i++) {
			User u1 = new User("Ram",42332432L, (byte)(10*i));
			users.add(u1);
		}
		System.out.println(users);
		users.get(0).workout();
	}
}