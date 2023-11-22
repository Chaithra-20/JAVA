package com.kodnest.multithreaidng.synchronze2;

public class HospitalDemo {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		Tom tom = new Tom(h);
		Jerry jerry = new Jerry(h);
		
		Thread thread = new Thread(tom);
		Thread thread2 = new Thread(jerry);
		
		thread.start();
		thread2.start();
		
	}
}
