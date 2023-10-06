package com.kodnest.assesment.Randomclass;

import java.util.Random;

public class RandomInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		for(int i=1;i<5;i++)
		{
			random.ints().limit(3).forEach(System.out::println);
			
		}

	}

}
