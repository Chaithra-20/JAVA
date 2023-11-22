package com.kodnest.example1.byExtendingThreadClass;

public class PrintNum extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("The Number = "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
