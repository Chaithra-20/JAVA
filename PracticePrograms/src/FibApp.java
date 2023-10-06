 import java.util.Scanner;

public class FibApp {
	
	public static void printFibonacciSeries(int n)
	{
		int fib1=0;
		int fib2=1;
		
		System.out.print(fib1+" "+fib2+" ");
		for(int i=3;i<=n;i++)
		{
			int nextNo=fib1+fib2;
			System.out.print(nextNo+" ");
			fib1=fib2;
			fib2=nextNo;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		
		printFibonacciSeries(n);

		scan.close();
	}

}
