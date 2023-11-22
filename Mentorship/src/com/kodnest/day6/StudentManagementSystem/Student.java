package com.kodnest.day6.StudentManagementSystem;

import java.util.Scanner;

public class Student {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name=scan.next();
		int age=scan.nextInt();
		int marks=scan.nextInt();
	
		
		
//		System.out.println(Student.isPassing(marks));

		boolean b=Student.isPassing(marks);
		String s=b?"pass":"fail";
		System.out.println(s);
	}
	
	 public static boolean isPassing(int marks)
	{
		return marks>60;
	}

}
