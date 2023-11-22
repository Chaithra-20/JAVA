
package com.kodnest.collection.upcasting;

import java.util.*;

public class Upcasting {

	public static void main(String[] args) {
		//Upcasting woth collection objectsl
		List l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		List l2=new LinkedList<>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		System.out.println(l2);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		Queue que=new ArrayDeque<>();
		que.add(11);
		que.add(22);
		que.add(33);
		System.out.println(que);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		Queue que1=new PriorityQueue<>();
		que1.add(99);
		que1.add(88);
		que1.add(77);
		System.out.println(que1);
		
		
	}

}
