package com.kodnest.multithread.singlerun;

public class MyThread extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("numbers"))
		{
			printNumber();
			
		}else {
			printCharacters();
		}
	}
	public void printNumber() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("***"+i+" ");
		}

	}
	public void printCharacters() {
		for(int i=65;i<=74;i++)
		{
			System.out.println((char)i+" ");
		}
	}

}
