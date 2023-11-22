package com.kodnest.comparator.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSortingDemo {
	public static void main(String[] args) {
		Employee e1=new Employee(32, "Bharath", 50000);
		Employee e2=new Employee(21, "Nayana", 20000);
		Employee e3=new Employee(78, "Rohith", 30000);
		
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		
		System.out.println("Before Sorting--->");
		System.out.println(employeeList);
		Collections.sort(employeeList,new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.empId>e2.empId) {
					return 1;
				}
				else if(e1.empId<e2.empId)
				{
					return -1;
				}
				else
				{
				return 0;
				}
			}
		});
		System.out.println("After Sorting Id in ascending order.......");
		System.out.println(employeeList);
		Collections.sort(employeeList,new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		});
		System.out.println("After Sorting Name id ascending order....");
		System.out.println(employeeList);
		Collections.sort(employeeList,new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.salary>e2.salary) {
					return 1;
				}
				else if(e1.salary<e2.salary)
				{
					return -1;
				}
				else
				{
				return 0;
				}
			}
		});
		System.out.println("After Sorting Salary in ascending order....");
		System.out.println(employeeList);
		System.out.println("In Descending order");
		Collections.sort(employeeList,new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.empId<e2.empId) {
					return 1;
				}
				else if(e1.empId>e2.empId)
				{
					return -1;
				}
				else
				{
				return 0;
				}
			}
		});
		System.out.println("After Sorting Id in descending order....");
		System.out.println(employeeList);
		Collections.sort(employeeList,new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e2.getEmpName().compareTo(e1.getEmpName());
			}
		});
		System.out.println("After Sorting Name in descending order....");
		System.out.println(employeeList);
		Collections.sort(employeeList,new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.salary>e2.salary) {
					return -1;
				}
				else if(e1.salary<e2.salary)
				{
					return 1;
				}
				else
				{
				return 0;
				}
			}
		});
		System.out.println("After Sorting Salary in descending order....");
		System.out.println(employeeList);
	}
}
