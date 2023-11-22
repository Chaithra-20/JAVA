package com.kodnest.collections1.linkedlist;

import java.util.LinkedList;

public class CollectionLLEx1 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(1,11);
		l1.add(2, l1);

	}

}
