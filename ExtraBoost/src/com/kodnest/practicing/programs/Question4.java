package com.kodnest.practicing.programs;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scan = new Scanner(System.in);
		int bn=scan.nextInt();
		int dc=0;
		int n=0;
		
		while(bn>0)
		{
				int temp=bn%10;
				dc+=temp*Math.pow(2, n);
				bn=bn/10;
				n++;
				
			
		}
		System.out.println(dc);
		

	}

}
