package com.kodnest.strings.comparisions;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RAMA";
		String s2="SITA";
		String s3=s1+s2;
		String s4=s1+s2;
		if(s3==s4)
		{
			System.out.println("References are Equal");
		}
		else
		{
			System.out.println("References are Unequal");
		}
		
		if(s3.equals(s4))
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			System.out.println("String are UnEqual");
		}


	}

}
