package com.tcs.threads;

public class Worker implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());	
		try {
			Thread.sleep(99);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
