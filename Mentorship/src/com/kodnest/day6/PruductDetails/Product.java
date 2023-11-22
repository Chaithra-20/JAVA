package com.kodnest.day6.PruductDetails;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name=scan.next();
		int price=scan.nextInt();
		int quantityInStock=scan.nextInt();
		
		displayProductInfo(name,price,quantityInStock);
		
	}
	
	public static void displayProductInfo(String name, int price, int quantity)
	{
		System.out.println("Product name : "+name);
		System.out.println("Product price : "+price);
		System.out.println("Product quantity : "+quantity);
	}

}

