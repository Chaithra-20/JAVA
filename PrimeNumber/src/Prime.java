import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();

		if(n<2)
		{
			System.out.println("The Entered number "+n+ " is not a prime number ");
		}
		else
		{
			boolean isPrime=true;

			for(int i=2;i*i<=n;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
			{
				System.out.println("The Entered number "+n+ " is  a prime number ");
			}
			else
			{
				System.out.println("The Entered number "+n+ " is  not a prime number ");
			}
		}
	}


}

