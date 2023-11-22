package com.kodnest.multitreading.synchronize;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Printer printer = new Printer();
		
		Thread t1 = new Thread(printer);
		Thread t2 = new Thread(printer);
		Thread t3 = new Thread(printer);
		
		t1.setName("Java");
		t2.setName("C");
		t3.setName("Python");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
