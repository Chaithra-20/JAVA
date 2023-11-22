package com.kodnest.collections.BackwardTraverse;

import java.util.ArrayList;
import java.util.ListIterator;

public class InList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		ListIterator<Integer> itr1=a1.listIterator(a1.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous()+" ");
		}
		

	}

}
