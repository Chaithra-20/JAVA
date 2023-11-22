package com.kodnest.multithread.singlerun;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread myThread = new MyThread();
		MyThread myThread2 = new MyThread();
		
		
		myThread.setName("Numbers");
		myThread2.setName("Characters");
		
		myThread.start();
		myThread2.start();
		

	}

}
