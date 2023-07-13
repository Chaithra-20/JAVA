import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		
		FinanceCalculator calculator = new FinanceCalculator();
		
		System.out.printf("%.2f",calculator.calculateSimpleInterest(principal, rate , time));
		
		
		//FinanceCalculator calculator = new FinanceCalculator();

		//System.out.printf("%.2f",calculator.calculateSimpleInterest(1000.0, 0.05, 2.0));
	}
}
