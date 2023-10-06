package com.kodnest.string.programs3;

public class FrequencyOfString {
	void frequencyString(String str)
	{
		int freq[]=new int[str.length()];
		char str1[]=str.toCharArray();
		for(int i=0;i<=str.length()-1;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(str1[i]==str1[j])
				{
					freq[i]++;
					str1[j]=' ';
				}
			}
		}
		
		for(int i=0;i<=freq.length-1;i++)
		{
			if(str1[i]!=' ')
			{
				System.out.println(str1[i]+" "+freq[i]);
			}
		}
	}

}
