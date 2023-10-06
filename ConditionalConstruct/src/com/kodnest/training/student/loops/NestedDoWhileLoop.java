package com.kodnest.training.student.loops;

public class NestedDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			System.out.println("I= "+i);
			int j=1;
			do
			{
				System.out.println("J= "+j);
				j++;
			}while(j<=3);
			i++;
			System.out.println(" ");
		}while(i<=3);
		
	}

}
