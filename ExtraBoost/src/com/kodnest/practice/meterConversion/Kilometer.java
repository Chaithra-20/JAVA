package com.kodnest.practice.meterConversion;

public class Kilometer extends Meter {

	public Kilometer(double value) {
		super(value);
		
	}
	
	public  void convetKilometer()
	{
		System.out.println("Converted unit : "+value/1000.0);
	}
	

}
