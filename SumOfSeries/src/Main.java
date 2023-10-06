import java.util.Scanner;

public class Main {
	
	public static void calculateSumOfSeries(int n)
	{
		double sum=0.0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+1.0/i;
		}
		System.out.printf("The sum of the series is %f ",sum);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		calculateSumOfSeries(n);
		

	}

}
