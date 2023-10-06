
import java.util.Scanner;


public class ArmStrongApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		ArmStrong armstrong=new ArmStrong();
		int res=armstrong.printArmStrong(n);
		
		
		if(res==n)
		{
			System.out.println("Entered number is ArmStrong number");
		}
		else
		{
			System.out.println("Entered number is not ArmStrong number");
		}

		scan.close();
	
	}

}

