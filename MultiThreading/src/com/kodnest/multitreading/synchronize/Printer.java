package com.kodnest.multitreading.synchronize;

public class Printer implements Runnable{
	Program p;

	@Override
	synchronized public void run() {
		try {
			System.out.println("Printing started for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Printing inprogress for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Printing completed for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	

}
