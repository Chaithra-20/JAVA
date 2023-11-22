package com.kodnest.collections1.arrayList;

import java.util.*;

public class CollectionEx5 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40 );
		a1.add(50);
		
		
		
		ArrayList a2 = new ArrayList();
		a2.add("ONE");
		a2.add("TWO");
		a2.add("THREE");
		a2.add("FOUR" );
		a2.add("FIVE");
		
		System.out.println(a1);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(a2);
		
//		a2.addAll(a1);// add all the elements of specified element at the end
//		System.out.println(a2);//output:[ONE,TWO,THREE,FOUR,FIVE,10,20,30,40,50]
		a2.addAll(2,a1);//add all the elements of specified element at the specified index.
		System.out.println(a2);
		
	}

}
