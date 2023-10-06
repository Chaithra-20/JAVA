import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number to find the whether it is prime or not");
		int n=scan.nextInt();
		//for(int i=2;i<n;i++)
		//{
		//	if(n%i==0)
		//	{
		//sop("not prime");
		//return;
		//	}
	
		//}
		//sop("prime");
		
		int count=1;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			count++;
		}
		if(count==2)
		{
			System.out.println("number is  prime ");
		}
		else
		{
			System.out.println("number is  not prime ");
		}
	}

}
