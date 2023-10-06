package com.kodnest.practicing.programs;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str="HELLO WORLD!";
		char ch=scan.next().charAt(0);
//		char arr[]=str.toCharArray();
//		int count=0;
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			if(ch==arr[i])
//			{
//				for(int j=i+1;j<=arr.length-1;j++)
//				{
//					System.out.print(arr[j]);
//				}
//				return;
//			}
//			
//		}
//		if(count>=0)
//		{
//			System.out.print(str);
//		}
		
			
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
				for(int j=i+1;j<=str.length()-1;j++)
				{
					System.out.print(str.charAt(j));
				}
				return;
			}
		}
		if(count>=0)
		{
			System.out.print(str);
		}
		
	}

}
