rimport java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the Natural number ");
		int N =scan.nextInt();
		int sum=0;
		
		for(int i=0;i<=N;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of Natural number is : "+sum);
	}

}
