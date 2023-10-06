package com.kodnest.objectorientation.constructorchaining;

public class Student {
	
	String name;
	int age;
	
	public Student()
	{
		
	}
	public Student(String name,int age)
	{
		this.name=name;
		this.age=30;
	}
	public Student(String name)
	{
		this.name=name;
		age=21;
	}
}
