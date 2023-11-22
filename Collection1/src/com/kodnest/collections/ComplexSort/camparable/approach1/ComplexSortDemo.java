package com.kodnest.collections.ComplexSort.camparable.approach1;

import java.util.*;


public class ComplexSortDemo {

	public static void main(String[] args) {
		Student s1=new Student(12, "Chirag", 73.5);
		Student s2=new Student(14, "Dimpana", 87.9);
		Student s3=new Student(10, "Kushvik", 65.2);

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		System.out.println("Before Sorting..."+studentList);
		SortStudentById sd=new SortStudentById();
		Collections.sort(studentList,sd);
		System.out.println("After Sorting.....");
		System.out.println(studentList);
	}

}
