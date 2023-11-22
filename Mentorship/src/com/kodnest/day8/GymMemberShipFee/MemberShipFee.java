package com.kodnest.day8.GymMemberShipFee;

import java.util.Scanner;

public class MemberShipFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age=scanner.nextInt();
		String membershipType=scanner.next();
		
		if(age<18)
		{
			System.out.println("30");
		}
		else if(age>=18 && age<=65)
		{
			if(membershipType.equals("Premium"))
			{
				System.out.println("80");
			}
			else
			{
				System.out.println("50");
			}
		}
		else
		{
			System.out.println("40");
		}
	}

}
