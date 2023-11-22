package com.kodnest.collections.generics;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Two");
		pq.add("Twenty");
		pq.add("Thirty");
		//pq.add(10); Generate element compile time error\
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		//pq1.add("Ten") Error bcz Generate element compile time error\
		
		System.out.println(pq);
		System.out.println(pq1);
	}

}
