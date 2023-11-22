package com.kodnest.practice.meterConversion;

public class Centimeter extends Meter
{

	public Centimeter(double value) {
		super(value);
		
		
	}
	public  void convetKilometer()
	{
		System.out.println("Converted unit :" +value*100.0);
	}

}
