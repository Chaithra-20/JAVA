package com.kodnest.multipleThread.example3;

public class Chatting extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Chatting started just now");
			Thread.sleep(2000);
			System.out.println("Chit Chat Chit Chat Bla Bla.....");
			Thread.sleep(2000);
			System.out.println("Chatting stopped");
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
