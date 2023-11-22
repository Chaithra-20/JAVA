package com.kodnest.Example2.byImplementingRunnableInterface;

public class PrintCharacter implements Runnable{
	@Override
	public void run() {
		for(int i=65;i<=74;i++)
		{
			System.out.println((char)(i));
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
