import java.util.Scanner;

public class GcdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		
//		Gcd.Gcd(m,n);
		
	Gcd gcd =new Gcd();
		int res=gcd.Gcd(m, n);
		System.out.println("GCD of "+m+" and "+n+"  is :"+res);

		
		scan.close();
	}

}



