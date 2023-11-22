package com.kodnest.day7.TriangleTypeDetermination;

import java.util.Scanner;

public class TriangleShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int side1=scanner.nextInt();
		int side2=scanner.nextInt();
		int side3=scanner.nextInt();
		
		if(side1==side2  && side2==side3 )
		{
			System.out.println("EQuilateral");
		}
		else if(side1==side2 || side2==side3 || side1==side3)
		{
			System.out.println("Isoceleous");
		}
		else if(side1!=side2 && side2!=side3 && side3!=side1)
		{
			System.out.println("Scalene");
		}

		else
		{
			System.out.println("Triangle");
		}
	}

}
