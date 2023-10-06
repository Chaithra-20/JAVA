package com.kodnest.string.programs;

public class CaseCount {
	void countCases(String str)
	{
		int upper=0;
		int lower=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch[]=str.toCharArray();
			if(ch[i]>='A' && ch[i]<='Z')
			{
				upper++;
			
			}
			
			else if(ch[i]>='a' && ch[i]<='z')
			{
				lower++;
				
			}
			
		}
		System.out.println("Upper case Letters"+upper);
		System.out.println("Lower case letters"+lower);
	}
	
	void countCases1(String str)
	{
		int upper=0;
		int lower=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				lower++;
			}
			else
			{
				upper++;
			}
		}
		System.out.println("Upper case Letters "+upper);
		System.out.println("Lower case letters "+lower);
	}
	
	void countCases2(String str)
	{
		int lower=0;
		int upper=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			int ch=str.charAt(i);
			if(ch>=97 && ch<=122)
			{
				lower++;
			}
			else
			{
				upper++;
			}
		}
		System.out.println("Upper case Letters "+upper);
		System.out.println("Lower case letters "+lower);
	}

}
