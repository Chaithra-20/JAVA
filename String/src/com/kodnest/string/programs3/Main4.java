package com.kodnest.string.programs3;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		int freq[]=new int[str.length()];
		
		FrequencyOfString frequencyOfString=new FrequencyOfString();
		frequencyOfString.frequencyString(str);
	}

}
