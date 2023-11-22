package com.kodnest.practice.meterConversion;

import java.util.Scanner;

public class Coversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		double value=scan.nextDouble();
		if(s.equals("Centimeter"))
		{
		
		Centimeter centimeter = new Centimeter(value);
		centimeter.convetKilometer();
		}
		else if(s.equals("Kilometer"))
		{
		
		Kilometer kilometer=new Kilometer(value);
		kilometer.convetKilometer();;
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
