import java.util.Scanner;

public class FcatorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter the number");
			int n=scan.nextInt();
			int fact=1;
			
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Fcatorial of a number is "+fact);
			
	}

}
