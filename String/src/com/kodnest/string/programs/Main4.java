package com.kodnest.string.programs;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		
//		CaseCount caseCount=new CaseCount();
//		caseCount.countCases(str);
		
//		CaseCount caseCount=new CaseCount();
//		caseCount.countCases1(str);

		CaseCount caseCount=new CaseCount();
		caseCount.countCases2(str);

	}

}
