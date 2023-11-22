package com.kodnest.collections1.arrayList;

import java.util.ArrayList;

public class CollectionEx3 {
	public static void main(String[] args) {
			ArrayList a1 = new ArrayList();
			a1.add(10);
			a1.add(20);
			a1.add(30);
			a1.add(40 );
			a1.add(50);
			
			a1.add(3, 1111);
			System.out.println(a1);
			System.out.println("***************************");
			a1.set(3, 33);
			System.out.println(a1);
	}
}
