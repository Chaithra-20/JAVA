package com.kodnest.pattern.assignment2;

public class PatternA25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			int count=i;
			for(int k=1;k<=i;k++)
			{
				System.out.print(count);
				count++;
			}
			int duplicate=i;
			for(int l=2;l<=i;l++)
			{
				System.out.print(duplicate);
				duplicate++;
			}
			
			System.out.println();
		}
		
		

	}

}
