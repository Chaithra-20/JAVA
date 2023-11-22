package com.kodnest.Example2.byImplementingRunnableInterface;

public class PrintNumber implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("The Number = "+i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
