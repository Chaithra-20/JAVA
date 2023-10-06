package ConditionalConstruct;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		if(a>b)
		{
			int res=b-a;
			System.out.println("Result is: "+res);
		}
		else
		{
			int res=a-b;
			System.out.println("Result is: "+res);
		}
	}

}
