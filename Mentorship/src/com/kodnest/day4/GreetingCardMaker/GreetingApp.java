package com.kodnest.day4.GreetingCardMaker;

import java.util.Scanner;

public class GreetingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String greet=scanner.next();
		String name=scanner.next();
		
		GreetingCard greetingCard = new GreetingCard();
		greetingCard.printGreeting(greet, name);
		
		
//		System.out.println("\" java\"    ");

	}

}
