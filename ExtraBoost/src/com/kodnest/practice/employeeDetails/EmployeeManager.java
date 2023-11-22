package com.kodnest.practice.employeeDetails;

public class EmployeeManager {
	private Employee employee[];
	private int size ;
	private int capacity;
	
	
	public EmployeeManager( int capacity) 
	{
		employee=new Employee[capacity];
		this.capacity=capacity;
		size=0;
	}
	public void addEmployee(String name, double salary) 
	{
		if(size<capacity)
		{
			employee[size]=new Employee(name,salary);
			System.out.println("Employee ID for the given employee : "+employee[size].getId());
			size++;
		}
		else
		{
			System.out.println("No Vaccancy in the company.");
		}
	}
	public void displayEmployee(int eid) {
		for(int i=0;i<size;i++)
		{
			if(eid==employee[i].getId()) 
			{
				System.out.println("Employee Details : ");
				System.out.println(employee[i].getId()+" "+employee[i].getName()+" "+employee[i].getSalary());
			}
		}

	}
	public void allEmployeeList() {
		for(int i=0;i<size;i++)
		{
			
				System.out.println("Employee Details : ");
				System.out.println(employee[i].getId()+" "+employee[i].getName()+" "+employee[i].getSalary());  
		}


	}
	
}
