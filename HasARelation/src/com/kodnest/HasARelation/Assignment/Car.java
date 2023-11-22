package com.kodnest.HasARelation.Assignment;

public class Car 
{
	String brand;
	String color;
	int cost;
	
	public Car(String brand, String color, int cost)
	{
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	public String getBrand() 
	{
		return brand;
	}
	
	public String getColor() 
	{
		return color;
	}
	
	public int getCost() 
	{
		return cost;
	}
	
	Engine engine=new Engine("Inline Engine",200);
	
	
	
	

}
