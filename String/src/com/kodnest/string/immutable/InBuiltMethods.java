package com.kodnest.string.immutable;

public class InBuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("RAJA RAM MOHAN ROY");
		System.out.println(s1.length());
		s1=s1.replace('R', 'A');
		System.out.println(s1);
		s1=s1.replaceAll("AAJA", "RAJA");
		System.out.println(s1);
		System.out.println("------------------------------------------");
		String str="OMKAR";
		String str1=str.intern();
		System.out.println(str1);
		String str2="OMKAR";
		if(str1==str2)
		{
			System.out.println("References are Equal");
		}
		else
		{
			System.out.println("References are UnEqual");
		}
		System.out.println("-------------------------------------------");
		
		String string=new String("RAVANA BRAHMA");
		char arr[]=string.toCharArray();
		System.out.print("arr---> ");
		int i=0;
		do
		{
			System.out.print(arr[i]+" | ");
			i++;
		}while(i<=arr.length-1);
				
		

	}

}
