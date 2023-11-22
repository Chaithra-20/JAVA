package com.kodnest.day7.CalculateGrade;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int marks=scan.nextInt();
		if(marks<60)
		{
			System.out.println("F");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("D");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("C");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("A");
		}
	}

}
