package com.kodnest.example1.byExtendingThreadClass;

public class PrintChar extends Thread{
	@Override
	public void run() {
		for(int i=65;i<=74;i++)
		{
			System.out.println((char)(i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
