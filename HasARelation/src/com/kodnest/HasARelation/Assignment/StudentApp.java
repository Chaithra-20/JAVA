package com.kodnest.HasARelation.Assignment;

public class StudentApp {

	public static void main(String[] args)
	{
		
		Student stu=new Student();
		System.out.println("Brain Details");
		System.out.println(stu.brain.color);
		System.out.println(stu.brain.weight);
		System.out.println("=======================");
		
		System.out.println("Heart Details");
		System.out.println(stu.heart.color);
		System.out.println(stu.heart.weight);
		System.out.println("=======================");
		
		System.out.println("Book Details");
		Book book=new Book("Let us C","Yeshwanth",1000);
		stu.HasA2(book);
		System.out.println("=======================");
		
		System.out.println("Car Details");
		Car car=new Car("POLO","White",800000);
		stu.HasA(car);
		System.out.println("=======================");
		
		System.out.println("Engine Details");
		System.out.println(stu.c.engine.getType());
		System.out.println(stu.c.engine.getBhp());
		System.out.println("=======================");
		
		stu=null;
		System.out.println("Student object destroyed");
//		System.out.println("Brain Details");
//		System.out.println(stu.brain.color);
//		System.out.println(stu.brain.weight);
//		System.out.println("=======================");
//		
//		System.out.println("Heart Details");
//		System.out.println(stu.heart.color);
//		System.out.println(stu.heart.weight);
//		System.out.println("=======================");
		
		System.out.println("Book Details");
		System.out.println(book.getAuthor());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println("=======================");
		
		System.out.println("Car Details");
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
		System.out.println(car.getCost());
		System.out.println("=======================");
		
//		car=null;
		//error
		System.out.println("Engine Details");
		System.out.println(car.engine.type);
		System.out.println(car.engine.bhp);
		
		
		
	

	}

}
