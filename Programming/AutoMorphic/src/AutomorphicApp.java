import java.util.Scanner;

public class AutomorphicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
	
		Automorphic automorphic = new Automorphic();
		boolean res=automorphic.isAutomorphic(n);
		if(res==true)
		{
			System.out.println("Entered number "+n+" is automorphic");
		}
		else
		{
			System.out.println("Entered number "+n+" is not automorphic");
		}
	}

}
