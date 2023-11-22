package com.kodnest.day9.WeekDays;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		
		switch(num)
		{
		case 1: 
			{
				System.out.println("Monday");
				break;
			}
		case 2: 
			{
				System.out.println("Tuesday");
				break;
			}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Friday");
			break;
		}
		case 6:
		{
			System.out.println("Saturday");
		}
		case 7:
		{
			System.out.println("Sunday");
			break;
		}
		default:
		{
			System.out.println("Idiot go eat and sleep ......");
		}
				
		}
	}

}
