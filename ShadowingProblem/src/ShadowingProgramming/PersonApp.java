package ShadowingProgramming;

import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id");
		int id=scan.nextInt();
		System.out.println("Enter name");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("Enter Gender");
		String gender=scan.next();
		System.out.println("Enter email");
		String email=scan.next();
		System.out.println("Enter Phone Number");
		long phone=scan.nextLong();
		
		Person p1=new Person(id,name,gender,email,phone);
		System.out.println(p1.id+" "+p1.name+" "+p1.gender+" "+p1.email+" "+p1.phone);
		
	} 

}
