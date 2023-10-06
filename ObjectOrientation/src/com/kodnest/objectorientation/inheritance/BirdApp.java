package com.kodnest.objectorientation.inheritance;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle eagle = new Eagle();
		Sparrow sparrow = new Sparrow();
		
		eagle.name="Jatayu";
		eagle.color="Dark Brownie";
		eagle.eat();
		eagle.fly();
		eagle.hunts();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		
		sparrow.name="Gubbacchi";
		sparrow.color="Grey";
		sparrow.eat();
		sparrow.fly();
		sparrow.buildNest();

	}

}
