package com.kodnest.string.palindrome;

public class Palindrome {
	boolean isPalindrome(String str)
	{
		char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		String s=new String(arr2);
		System.out.println("String After reversing....---->"+s);
		//if(str.equals(s))
		if(str.equalsIgnoreCase(s))
		return true;
		else
			return false;
	}

}
