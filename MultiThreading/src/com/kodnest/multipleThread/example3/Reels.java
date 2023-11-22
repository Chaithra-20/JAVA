package com.kodnest.multipleThread.example3;

public class Reels extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Creating Reels");
			Thread.sleep(2000);
			System.out.println("Uploading Reels");
			Thread.sleep(2000);
			System.out.println("Share the Reels");
			Thread.sleep(20000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
