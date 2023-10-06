import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		Prime prime=new Prime();
		for(int i=a;i<=b;i++)
		{
			boolean res=prime.isPrime(i);
			if(res==true)
			{
				System.out.println(i);
			}
		}

	}

}
