package com.kodnest.strings.comparisions;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Chaithra");
		String s2=new String("CHAITHRA");
		
		if(s1==s2)
		{
			System.out.println("Reference comparision ==> eualsTo operator ");
			System.out.println("Reference are Equal ");
		}
		else
		{
			System.out.println("Reference comparision ==> eualsTo operator ");
			System.out.println("References are UnEqual");
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		if(s1.equals(s2))
		{
			System.out.println("String comparision ==> equals()");
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String comparision ==> equals()");
			System.out.println("String are Unequal");
		}
		System.out.println("++++++++++++++++++++++++++++");
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("String Comp===> equalIgnoreCase()");
			System.out.println("Strings are Unequal");
		}
		else
		{
			System.out.println("String Comp===> equalIgnoreCase()");
			System.out.println("String are unequal");
		}

	}

}
