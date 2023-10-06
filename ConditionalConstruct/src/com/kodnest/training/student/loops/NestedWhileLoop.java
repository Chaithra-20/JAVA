package com.kodnest.training.student.loops;

public  class NestedWhileLoop {

	public static void main(String[] args) {
		int i=1;
		
		while(i<=3) {
			System.out.println("I= "+i);
			int j=1;
			
			while(j<=2)
			{
				System.out.println("J= "+j);
				j++;
			}
			i++;
		}
	}

}
