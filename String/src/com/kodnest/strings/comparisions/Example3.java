package com.kodnest.strings.comparisions;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RAMA";
		String s2=new String("RAMA");
		if(s1==s2)
		{
			System.out.println("References are Equal");
		}
		else
		{
			System.out.println("References are Unequal");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			System.out.println("String are UnEqual");
		}


	}

}
