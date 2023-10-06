package com.kodnest.objectorientation.inheritance;

public class Teacher {
	String name;
	String subject;
	
	public void markAttedence()
	{
		System.out.println(subject+" Teacher "+name+" marked the students attedence");
	
	}
	public void teach()
	{
		System.out.println(name+" teacher teaches the subject "+subject );
	}

}
