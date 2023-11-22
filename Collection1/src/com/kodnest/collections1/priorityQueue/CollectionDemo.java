package com.kodnest.collections1.priorityQueue;

import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add("Two");
		pq.add("Twenty");
		pq.add("Thirty");
		
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(20);
		pq1.add(10);
		pq1.add(5);
		pq1.add(30);
		System.out.println(pq);
		System.out.println(pq1);
	}

}
