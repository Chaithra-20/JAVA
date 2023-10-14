package com.kodnest.day3.LibraryManagement;

public class Book {
	static String title;
	String author;
	int isbn;
	
	public Book(String title, String author, int isbn)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public void displayInfo()
	{
		System.out.println("Title of the book : "+title);
		System.out.println("Author of the book :" +author);
		System.out.println("ISBN of the book : " +isbn);
		System.out.println("===================================");
	}
	
	

}
