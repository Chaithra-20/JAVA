package com.kodnest.string.programs3;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first String");
		String str=scan.nextLine();
		System.out.println("Enter a second String");
		String str2=scan.nextLine();
		if(str.length()==str2.length())
		{

			StringAnagram anagram=new StringAnagram();
			//		anagram.anagramString(str,str2);
			boolean res=anagram.isAnagram(str, str2);
			if(res==true)
			{
				System.out.println("Entered Strings Are Anagrams");
			}
			else
			{
				System.out.println("Entered Strings Are Not Anagrams");
			}

		}
		else
		{
			System.out.println("Strings Are Not Anagrams");
		}
	}

}







