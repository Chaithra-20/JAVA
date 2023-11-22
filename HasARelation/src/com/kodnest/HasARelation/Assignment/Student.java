package com.kodnest.HasARelation.Assignment;

public class Student extends Human
{
	
	Car c;
	public void HasA(Car c)
	{
		this.c=c;
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getCost());
	}
	
	Book ref;
	public void HasA2(Book ref)
	{
		this.ref=ref;
		System.out.println(ref.getAuthor());
		System.out.println(ref.getName());
		System.out.println(ref.getPrice());
	}

}
