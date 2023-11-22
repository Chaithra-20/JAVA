package com.kodnest.multipleThread.example3;

public class InstagramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Instagram Application started...");
		Chatting chatting = new Chatting();
		Reels reels = new Reels();
		
		chatting.start();
		reels.start();
		
		try {
			chatting.join();
			reels.join();
		}
		catch (InterruptedException e) {
			
		}
		System.out.println("Instagram Application Terminated....");

	}

}
