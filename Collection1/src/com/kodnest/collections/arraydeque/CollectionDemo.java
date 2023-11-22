package com.kodnest.collections.arraydeque;

import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayDeque deque = new ArrayDeque();
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.addFirst("First");
		deque.addLast("Last");
		System.out.println(deque);
	}
}
