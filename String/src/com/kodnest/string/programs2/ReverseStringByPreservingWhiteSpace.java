package com.kodnest.string.programs2;

public class ReverseStringByPreservingWhiteSpace {
	String reverseByPreservedWhiteSpace(String str)
	{
		char arr[]=str.toCharArray();
		char rev[]=new char[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
				if(arr[i]==' ')
				{
					rev[i]=' ';
				}
		}
		int j=rev.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=' ')
			{
				if(rev[j]==' ')
				{
					j--;
				}
				rev[j]=arr[i];
				j--;
			}
		}
		str=new String(rev);
		return str;
	}

}

