package com.kodnest.day5.PrintDOBAndZodiac;

import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int date=scan.nextInt();
		int month=scan.nextInt();
		String zodiac=scan.next();
		
		System.out.println("Date of Birth: "+date);
		System.out.println("Month of Birth: "+month);
		System.out.println("Zodiac Sign: "+zodiac);
		

	}

}
