package com.kodnest.collections1.arrayList;

import java.util.*;

public class CollectEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40 );
		a1.add(50);
		a1.add(10);
		
		System.out.println("IndexOf(30)= "+a1.indexOf(30));
		System.out.println("IndexOf(10)= "+a1.indexOf(10));
		System.out.println("LastIndexOf(10)= "+a1.lastIndexOf(10));

	}

}
