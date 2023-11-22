package com.kodnest.collections.ComplexSort.camparator.approach2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


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
		
		Collections.sort(studentList,new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if(s1.id>s2.id) {
					return 1;
				}
				else if(s1.id<s2.id){
					return -1;
				}
				else {
					return 0;
				}
			}
			
		});
		System.out.println("After Sorting...."+studentList);
		
		Collections.sort(studentList,new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
				
			
		}		
		});
		System.out.println("After Sorting...."+studentList);
	}

}
