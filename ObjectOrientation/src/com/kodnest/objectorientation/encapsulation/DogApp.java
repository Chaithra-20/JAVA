package com.kodnest.objectorientation.encapsulation;

public class DogApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Bheema", "Golden", 5, "LAB");
		System.out.println(dog.getName()+" "+dog.getColor()+" "+dog.getAge()+" "+dog.getBreed());
	}

}
