import java.util.Scanner;

public class StrongNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		StrongNum strongNum = new StrongNum();
		boolean res=strongNum.isStrong(n);
		if(res==true)
		{
			System.out.println("Entered number "+n+" is strong number ");
		}
		else
		{
			System.out.println("Entered number "+n+" is not a strong number ");
		
		}

	}

}
