package com.kodnest.example1.byExtendingThreadClass;

public class Demo {

	public static void main(String[] args) {
		PrintNum t1 = new  PrintNum();
		t1.start();
		
		PrintChar t2 = new PrintChar();
		t2.start();
	}

}
