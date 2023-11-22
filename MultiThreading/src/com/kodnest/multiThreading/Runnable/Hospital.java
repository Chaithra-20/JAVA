package com.kodnest.multiThreading.Runnable;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h=new Hospital();
		Treatment tom = new Treatment(h);
		Treatment jerry = new Treatment(h);
		
		Thread thread = new Thread(tom);
		Thread thread2 = new Thread(jerry);
		
		thread.setName("Tom");
		thread2.setName("Jerry");
		
		thread.start();
		thread2.start();

	}

}
