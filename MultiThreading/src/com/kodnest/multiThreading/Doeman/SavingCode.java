package com.kodnest.multiThreading.Doeman;

public class SavingCode extends Thread {
	@Override
	public void run() {
		for(;;)//Infinite loops
		{
			System.out.println("Saving code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}

		}
	}
}
