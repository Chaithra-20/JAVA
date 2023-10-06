package com.kodnest.string.immutable;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin";
		String s2="Saurav";
		
		if(s1.compareTo(s2)>0)
		{
			System.out.println("string 1 is Greater than string 2");
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println("string 2 is Greater than string 1");
		}
		else
		{
			System.out.println("String Are Equal");
		}


	}

}
