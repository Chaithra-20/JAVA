package com.kodnest.training.student.loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int pageno=100;
		
		boolean bored=true;
	
		int i=1;
		do
		{
			System.out.println("KodWoman read the page " +i);
			i++;
			System.out.println("Do you want to continue ? ");
			bored=scan.nextBoolean();
		}while(bored);
		System.out.println("Yes i am bored");
			
	}

}
