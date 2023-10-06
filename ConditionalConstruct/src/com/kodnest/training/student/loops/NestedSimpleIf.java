package com.kodnest.training.student.loops;

import java.util.Scanner;

public class NestedSimpleIf {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the student score in a subject :");
		 int marks=scan.nextInt();
		 if(marks>=40)
		 {
			 System.out.println("Student got the passed marks");
			 if(marks >70)
				 System.out.println("Student get the distinction marks ");
		 }
	}
}
		 