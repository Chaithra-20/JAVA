package com.kodnest.string.programs3;

public class RemovingDuplicates {

	String removeDuplicateCharacter(String str)
	{
		String s2="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(!s2.contains(String.valueOf(str.charAt(i))))
			{
				s2=s2+str.charAt(i);
			}
		}
		return s2;
	}
}
