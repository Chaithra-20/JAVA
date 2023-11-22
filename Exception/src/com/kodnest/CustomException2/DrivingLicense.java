package com.kodnest.CustomException2;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age to check eligibility for license");
		int age=scanner.nextInt();
		try {
			eligibilityForLicense(age);
		} catch (UnderagedException | OveragedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static void eligibilityForLicense(int age)throws UnderagedException, OveragedException {
		System.out.println("eligibilityForLicense() method started.....");
		if(age>=18 && age<=65)
		{
			System.out.println("Eligible to get a Driving License");
		}
		else if(age<18)
		{
			System.out.println("Not Eligible");
			throw new UnderagedException("Not eligible wait till get eligibility");
		}
		else 
		{
			System.out.println("Not Eligible");
			throw new OveragedException("Not eligible to get a Driving License ");
		}
		System.out.println("eligibilityForLicense() method ended.....");
		
	}

}
