package com.kodnest.collections.arraydeque;

import java.util.ArrayDeque;

public class CollectionDemo1 {

	public static void main(String[] args) {
		ArrayDeque deque = new ArrayDeque();
		deque.add(10);
		deque.add(20.3);
		deque.add("Thirty");
		deque.add(true);
		System.out.println("First "+deque.getFirst());
		System.out.println("Last "+deque.getLast());
		
		deque.addFirst(111);
		deque.addLast(999);
		System.out.println("First "+deque.getFirst());
		System.out.println("Last "+deque.getLast());
		System.out.println(deque);
	}

}
