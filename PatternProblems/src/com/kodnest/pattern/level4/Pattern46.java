package com.kodnest.pattern.level4;

public class Pattern46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			
			}
			
			System.out.println();
			
		}


	}

}
