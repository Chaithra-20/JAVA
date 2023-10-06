package com.kodnest.string.programs;

import java.util.Scanner;

public class UnicodeOfString {

	void unicode(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println((int)ch[i]);
		}

	}
	
	void unicode1(String str)
	{
		for(int i=0;i<=str.length()-1;i++)
		{
			int unicode=(int)str.charAt(i);
			System.out.print(unicode+" ");
		}
	}
	


}
