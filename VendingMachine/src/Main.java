import java.util.Scanner;

public class Main {

	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "P01": System.out.println("COCA COLA");
		break;
		case "P02": System.out.println("PEPSI");
		break;
		case "P03": System.out.println("THUMBSUP");
		break;
		case "P04": System.out.println("STRING");
		break;
		default: System.out.println("COOL DRINKS");
		break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String productCode=scan.next();
		getProduct(productCode);

	}

}
