import java.util.Scanner;

public class ArmStongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		ArmStrong armStrong=new ArmStrong();
		for(int i=a;i<=b;i++)
		{
			int sum=armStrong.isArmStrong(i);
			
			if(i==sum)
			{
				System.out.println("ArmStrong Number between "+a+" and "+b+" are: "+i);
			}
			
		}

	}

}
