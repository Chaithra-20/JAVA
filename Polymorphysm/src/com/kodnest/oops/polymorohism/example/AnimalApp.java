package com.kodnest.oops.polymorohism.example;

public class AnimalApp {

	public static void main(String[] args) {
		
		Forest.acceptAnimal(new Tiger());
		Forest.acceptAnimal(new Deer());
		Forest.acceptAnimal(new Monkey());

	}

}
