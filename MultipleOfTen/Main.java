import java.util.Scanner;

public class Main {
	
	public static void checkMultipleOfTen(int n1,int n2)

	{
	if((n1%n2)==0)
	{
		System.out.println("The number "+n1+" is multiple of "+n2);
	}
	else
	{
		System.out.println("The number "+n1+" is not a multiple of "+n2);
	}
	}
	
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the first number");
	int n1=scan.nextInt();
	System.out.println("Enter the second number");
	int n2=scan.nextInt();
	checkMultipleOfTen(n1,n2);
}
}
