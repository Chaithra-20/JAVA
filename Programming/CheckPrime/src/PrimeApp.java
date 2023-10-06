import java.util.Scanner;

public class PrimeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		
		Prime prime=new Prime();
		boolean res=prime.isPrime(a);
		
		if(res==true) 
		{
			System.out.println("Entered number "+a+" is a prime number");
		}
		else
		{
			System.out.println("Entered number "+a+" is not a prime number");
		}

	}

}
