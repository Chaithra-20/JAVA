package com.kodnest.collection.ForwardTraverse;

import java.util.*;

public class TraverseDemo {

	public static void main(String[] args) {
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add("Shirt");
		a1.add("Jeans");
		a1.add("Cap");
		a1.add(10);
		a1.add(true);
		
		//1.Using for loop
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//2. Using for each loop
		for(Object s:a1)
		{
			System.out.println(s+" ");
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//3.Using Iterator
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
