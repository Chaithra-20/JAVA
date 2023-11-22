package com.kodnest.Example2.byImplementingRunnableInterface;

public class ThreadDemo {

	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		PrintCharacter pc = new PrintCharacter();
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();

	}

}
