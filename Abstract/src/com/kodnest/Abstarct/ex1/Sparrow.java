package com.kodnest.Abstarct.ex1;

public abstract class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.println("Sparrow is flying very low heigt");
		
	}
	
	abstract public void eat();
}
