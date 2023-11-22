package com.kodnest.collections.BackwardTraverse;

import java.util.*;

public class BackwardTraverse {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(57);
		ad.add(96);
		ad.add(256);
		// Using descendingIterator()
		Iterator itr = ad.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	
	}
}
