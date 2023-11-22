package com.kodnest.oops.polymorphism.example2;

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute.acceptTeacher(new CTeacher());
		Institute.acceptTeacher(new JavaTeacher());
		Institute.acceptTeacher(new PythonTeacher());

	}

}
