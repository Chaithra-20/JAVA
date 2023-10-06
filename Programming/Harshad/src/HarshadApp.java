import java.util.Scanner;

public class HarshadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		Harshad harshad = new Harshad();
		boolean res=harshad.isHarshad(n);
		if(res==true)
		{
			System.out.println("Entered number "+n+" is Harshad number ");
			
		}
		else
		{
			System.out.println("ENtered number "+n+" is not Harshad number");
		}
	}

}
