import java.util.Scanner;

public class AbundantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Abundant abundant = new Abundant();
		boolean res=abundant.isAbundant(n);
		if(res==true)
		{
			System.out.println("Entered number "+n+" is Abundant number");
		}
		else
		{
			System.out.println("Entered number "+n+" is not Abundant number");
		}

	}

}
