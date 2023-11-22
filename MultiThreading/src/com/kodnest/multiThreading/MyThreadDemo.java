package com.kodnest.multiThreading;

public class MyThreadDemo {

	public static void main(String[] args) {
		Thread t2=Thread.currentThread();
		System.out.println(t2);
		
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t3 = new MyThread();
		t3.start();
		MyThread t4 = new MyThread();
		t4.start();
	}

}
