import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		int res=CheckAramstrong.count(n);
		System.out.println(res);
		
		int res1=CheckAramstrong.isArmStrong(n,res);
		if(n==res1)
		{
			System.out.println("Entered number "+n+" is a armstrong number");
		}
		else
		{
			System.out.println("Entered number "+n+" is not armstrong number");
		}
		

	}

}
