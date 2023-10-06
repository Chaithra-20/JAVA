import java.util.Scanner;

public class DigitSumApp {

	public static void main(String[] args) {
		
		
			Scanner scan =new Scanner(System.in);
			int n=scan.nextInt();
			
			DigitSum digit=new DigitSum();
			System.out.println(digit.calculateSumOfDigits(n));
			
			scan.close();

		}

	}


