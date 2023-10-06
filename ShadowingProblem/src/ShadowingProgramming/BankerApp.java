package ShadowingProgramming;

import java.util.Scanner;

public class BankerApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter customer Id");
		int cusId=sc.nextInt();
		System.out.println("Enter customer name");
		sc.nextLine();
		String cusName=sc.nextLine();
		System.out.println("Enter customer salary");
		int cusSalary=sc.nextInt();
		System.out.println("Enter customer city");
		sc.nextLine();
		String cusCity=sc.nextLine();
		System.out.println("Enter customer account number");
		long accNum=sc.nextLong();
		System.out.println("Enter bank name");
		sc.nextLine();
		String bankName=sc.nextLine();
		System.out.println("Enter banker name");
		String bankerName=sc.nextLine();
		System.out.println("enter customer DOB");
		String cusDob=sc.nextLine();
		System.out.println("Enter customer email");
		String cusEmail=sc.next();
		System.out.println("Enter customer phone number");
		long cusPhone=sc.nextLong();
		
		Banker b1=new Banker(cusId,cusName,cusSalary,cusCity,accNum,bankName,bankerName,cusDob,cusEmail,cusPhone);
		System.out.println(b1.cusId+" "+b1.cusName+" "+b1.cusSalary+" "+b1.cusCity+" "+b1.accNum+" "+b1.bankName+" "+b1.bankerName+" "+b1.cusDob+" "+b1.cusEmail+" "+b1.cusPhone);
		b1.account();
		b1.deposit();
	}

}
