import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The number a "+a+" is greater among the three");
		}
		else if(b>a && b>c)
		{
			System.out.println("The number b "+b+" is greater among the three");
		}
		else
		{
			System.out.println("The number c "+c+" is greater among the three");
		}

	}

}
