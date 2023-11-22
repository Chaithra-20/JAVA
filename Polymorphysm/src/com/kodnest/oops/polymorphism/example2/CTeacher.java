package com.kodnest.oops.polymorphism.example2;

public class CTeacher extends Teacher {
	public void markAttendance() 
	{
		System.out.println("C Teacher is taking the attendance");
		
	}
	public void teach()
	{
		System.out.println("C Teacher is teaching C language");
	}
	public void doLabPractice()
	{
		System.out.println("C Teacher is doing C-lab coding");
	}

}
