package com.kodnest.training.student.loops;

import java.util.Scanner;

public class KodWoman {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter the energy level(i)");
		//for(int i=1;i<=5;i++)
			//System.out.println("KodWoman defeated the vilian "+i);
		int i=scan.nextInt();
		while(i>=1)
		{
			System.out.println("Kodwoman is fighting and the energy level is " +i);
		i--;
		}		System.out.println("energy lost");
		
	
		
	}

}
