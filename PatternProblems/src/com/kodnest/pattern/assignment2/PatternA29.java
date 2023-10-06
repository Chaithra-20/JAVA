package com.kodnest.pattern.assignment2;

public class PatternA29 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=5;j>=i;j--)
			{
				System.out.print(ch);
				ch++;
			}
			for(int k=1;k<=i*2-2;k++)
			{
				System.out.print(" ");
			}
			char ac='A';
			for(int l=5;l>=i;l--)
			{
				System.out.print(ac);
				ac++;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			for(int k=i*2-2;k<5*2-2;k++)
			{
				System.out.print(" ");
			}
			char bc='A';
			for(int l=1;l<=i;l++)
			{
				
				System.out.print(bc);
				bc++;
			}
			System.out.println();
		}

	}

}
