package com.kodnest.practice.program1;

public class LaptopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop10=new Laptop("icore","4TB");
		Laptop laptop20 = new Laptop("itab", "3TB");
		
		System.out.println(laptop10.getProcessorName()+" "+laptop10.getMemorySize()+" "+laptop20.getProcessorName()+" "+laptop20.getMemorySize());
	}

}
