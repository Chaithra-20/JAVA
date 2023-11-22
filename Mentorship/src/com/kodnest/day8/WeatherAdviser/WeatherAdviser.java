package com.kodnest.day8.WeatherAdviser;

import java.util.Scanner;

public class WeatherAdviser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Temperature=scan.nextInt();
		boolean isRaining=scan.nextBoolean();
		
		if(Temperature<10 )
		{
			System.out.println("It's advice to bring a coat.");
		}
		else if(Temperature>=10 && Temperature<=20 )
		{
			if(isRaining==true)
			{
			System.out.println(" Bring a umbrella.");
			}
			else
			{
				System.out.println("No special advice is needed");
			}
		}
		else
		{
			System.out.println("Wear light clothing");
		}
	}

}
