package com.kodnest.string.programs3;

public class DisplaySubString {

	void subString(String str)
	{
//		String s=" ";
//		for(int i=0;i<=str.length()-1;i++)
//		{
//			
//			for(int j=i;j<=str.length();j++)
//			{
//				
//			String str1=str.substring(i,j);
//			System.out.println(str1+" ");
//			}
//		}
//		
		for(int i=0;i<=str.length()-1;i++)
		{
			String temp="";
			for(int j=i;j<=str.length()-1;j++)
			{
				temp=temp+str.charAt(j);
				System.out.println(temp);
			}
		}

	}

}
