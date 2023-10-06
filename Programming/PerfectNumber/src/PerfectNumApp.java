import java.util.Scanner;

public class PerfectNumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		PerfectNum perfectNum = new PerfectNum();
		boolean res=perfectNum.isPerfect(n);
		
		if(res==true)
		{
			System.out.println("Entered number "+n+" is a perfect Number");
		}
		else
		{
			System.out.println("Entered number "+n+" is not a perfect Number");
		}
		

	}

}
