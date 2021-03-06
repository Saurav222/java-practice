package com.tcs.threads;

import java.util.Iterator;

public class Manager {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Worker worker1 = new Worker();
			Thread t1 = new Thread(worker1);
			t1.setPriority(9); //thread priority can be in range 1-10 only
			t1.start();
			System.out.println(Thread.currentThread().toString() + i);
		}
	}
}
 