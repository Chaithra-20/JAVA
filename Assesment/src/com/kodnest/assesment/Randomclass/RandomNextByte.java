package com.kodnest.assesment.Randomclass;

import java.util.Random;

public class RandomNextByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		byte[] bytes=new byte[10];
		random.nextBytes(bytes);
		System.out.println("Random bytes = ( ");
		for(int i=0;i<bytes.length;i++)
		{
			System.out.printf("%d ",bytes[i]);
		}
		System.out.println(")");

	}

}
