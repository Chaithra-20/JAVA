package com.kodnest.OOPS.encapsulation.example2;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setId(1);
		student.setName("CHIRAG");
		student.setMarks(99);
		student.setGender("male");
		
		System.out.println(student.getId()+" "+student.getName()+" "+student.getMarks()+" "+student.getGender());

	}

}
