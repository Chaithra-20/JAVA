package com.kodnest.string.programs2;

public class ReverseWordString {

	String reveseWord(String str)
	{
		String words[]=str.split(" ");
		String reversedString="";
		for(int i=0;i<=words.length-1;i++)
		{
			String word=words[i];
			String reverseWord=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}
			reversedString=reversedString+reverseWord+" ";
		}

		
		return reversedString;
	}
	
	String reverseStringWord(String str)
	{
		String wordarr[]=str.split(" ");
		String revword=null;
		String revString="";
		for(int i=0;i<=wordarr.length-1;i++)
		{
			String word=wordarr[i];
			char wa[]=word.toCharArray();
			char rwa[]=new char[wa.length-1];
			int j=rwa.length-1;
			for(int k=0;k<=wa.length-1;i++)
			{
				rwa[j]=wa[k];
				j--;
			}
			revword=new String(rwa);
			revString=revString+revword+" ";
			
		}
		return revString;
	}
}
