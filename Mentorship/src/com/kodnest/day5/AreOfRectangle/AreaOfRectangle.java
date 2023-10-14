package com.kodnest.day5.AreOfRectangle;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double len=scan.nextDouble();
		double wid=scan.nextDouble();
		
		System.out.println(printProduct(len, wid));
		
	}
	public static double printProduct(double len, double wid)
	{
		return len*wid;
	}

}
