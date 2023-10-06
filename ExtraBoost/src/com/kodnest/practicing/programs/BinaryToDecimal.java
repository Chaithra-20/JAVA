package com.kodnest.practicing.programs;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin=1010;
		int dec=0;
		int powf=1;
		while(bin!=0)
		{
			dec=dec+powf*(bin%10);
			powf=powf*2;
			bin=bin/10;
		}
		System.out.println(dec);

	}

}
