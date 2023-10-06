import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//DivisibleByThreeAndFive.divideByThreeAndFive(n);
		//Number.number(n);
		//DivisibleByTwo.divideByTwo(n);
		//DivisibleByThree.divideByThree(n);
		//DivisibleByFive.divideByFive(n);
		//EvenNumberDivisibleByThree.EvenNumber(n);
		//OddDivideByFive.OddDivideFive(n);
		//EvenNumber.even(n);
		//OddNumber.odd(n);
		//DivisibleByTwoAndFive.DivideByTwoAndFive(n);
		int count=0;
		for(int i=3;i<=n;i++)	
		{
			Prime prime=new Prime();
			
		int res=prime.printPrime(i);
		if(res!=0)
			
		{
			
			System.out.println(res);
			count++;
		
		}
		
		}
		System.out.println("Number of count of prime number is "+count);
		
	}

}
