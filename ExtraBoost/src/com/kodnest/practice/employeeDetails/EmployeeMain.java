package com.kodnest.practice.employeeDetails;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		EmployeeManager em = new EmployeeManager(5);
		boolean b=true;
		while(b)
		{
		int num=scan.nextInt();
		
		
		
		switch(num)
		{
		case 1: System.out.println("Enter the name");
				String name=scan.next();
				System.out.println("Enter the salary");
				double salary=scan.nextDouble();
				em.addEmployee(name,salary);
				break;
		
		case 2: System.out.println("Enter the id");
				int eid=scan.nextInt();
				em.displayEmployee(eid);
		break;
		
		case 3: em.allEmployeeList();
		break;
		
		default:return ;
		}
		}
	}

}
