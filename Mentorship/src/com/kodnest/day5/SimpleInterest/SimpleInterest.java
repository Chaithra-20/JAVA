package com.kodnest.day5.SimpleInterest;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double Principle=scanner.nextDouble();
		double rate=scanner.nextDouble();
		double time=scanner.nextDouble();
		
		calculateSimpleInterest(Principle, rate, time);
	}
		
		public static void calculateSimpleInterest(double principle, double rate, double time)
		{
			double SI=principle*rate*time;
			System.out.println(SI);
		}
		
		
		

	

}
