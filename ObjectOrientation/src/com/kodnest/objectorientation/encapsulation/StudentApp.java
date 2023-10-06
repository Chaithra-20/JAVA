package com.kodnest.objectorientation.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(1);
		student.setName("Chirag");
		student.setMarks(99);
		student.setGender("Male");
		System.out.println(student.getId()+" "+student.getName()+" "+student.getMarks()+" "+student.getGender());

	}

}
