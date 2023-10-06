package com.kodnest.string.programs3;

import java.util.Arrays;

public class StringAnagram {

		void anagramString(String str,String str1)
		{
			if(str.length()==str1.length())
			{
				char arr[]=str.toCharArray();
				char arr2[]=str1.toCharArray();
				for(int i=0;i<arr.length;i++)
				{
					int count1=1;
					if(arr[i]!=' ') 
					{
	
						for(int j=i+1;j<=arr.length-1;j++)
						{
							if(arr[i]==arr[j])
							{
								count1++;
								arr[j]=' ';
							}
						}
						System.out.println(arr[i]+"  "+count1);
					}
	
				}
				System.out.println("==========================================");
				for(int i=0;i<=arr2.length-1;i++)
				{
					int count2=1;
					if(arr2[i]!=' ')
					{
						for(int j=i+1;j<=arr2.length-1;j++)
						{
							if(arr2[i]==arr2[j])
							{
								count2++;
								arr2[j]=' ';
							}
						}
						System.out.println(arr[i]+" ====> "+count2);
	
					}
	
				}
			}
			
	
		}


	boolean isAnagram(String str1,String str2)
	{
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
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
