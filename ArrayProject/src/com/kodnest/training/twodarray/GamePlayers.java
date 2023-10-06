package com.kodnest.training.twodarray;

import java.util.Scanner;

public class GamePlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st D length");
		int arr[][]=new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2nd D length "+i);
			arr[i]=new int[scan.nextInt()];
		}
		scan.nextLine();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				System.out.println("Enter the scare of game "+i+" players "+j);
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array contents are.....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+ "   ");
			}
			System.out.println();
		}scan.close();
	}


	}


