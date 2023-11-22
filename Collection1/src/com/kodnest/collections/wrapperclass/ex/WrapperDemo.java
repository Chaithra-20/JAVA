package com.kodnest.collections.wrapperclass.ex;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		//Auto-Boxing
		a1.add(10);	//a1.add(new Integer(10)
		a1.add(20);	//a1.add(new Integer(20)
		a1.add(30); //a1.add(new Integer(30)
		System.out.println("Elements = "+a1);
		
		int l1=a1.get(0);	//(int)a1.get(0)
		int l2=a1.get(1);	//(int)a1.get(1)
		int l3=a1.get(2);	//(int)a1.get(2)
		System.out.println("l1= "+l1);
		System.out.println("l2= "+l2);
		System.out.println("l3= "+l3);
	}

}
