package com.kodnest.practice.program1;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str1=scanner.next();
		String str2=scanner.next();
		if(str1.length()==str2.length())
		{
			boolean res=isAnagram(str1,str2);
			if(res==true)
			{
			System.out.println("Entered Strings are anagram");
			}
			else
				System.out.println("Entered Strings are not anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}

	}
	public static boolean isAnagram(String str1,String str2)
	{
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return false;
			}
			else
			{
				continue;
			}
		}
		return true;
	}

}
