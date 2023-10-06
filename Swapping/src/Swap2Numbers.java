import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=scan.nextInt();
		System.out.println("Enter the second number: ");
		int b=scan.nextInt();
		
		System.out.println("Display the two numbers before swapping: "+a+ " , " +b);
		
			int help=a;
			a=b;
			b=help;
			
			System.out.println("Display the two numbers after swapping: "+a+ " , " +b);
			scan.close();
	}

}
