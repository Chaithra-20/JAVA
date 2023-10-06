import java.util.Scanner;

public class Main {
	
	public static void identifyPolygon(int sides)
	{
		if(sides==3)
		{
			System.out.println("TRIANGLE");
		}
		else if(sides==4)
		{
			System.out.println("QUADRILATERAL");
		}
		else if(sides==5)
		{
			System.out.println("PENTAGON");
		}
		else if(sides==6)
		{
			System.out.println("HEXAGON");
		}
		else
		{
			System.out.println("POLYGON");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sides=scan.nextInt();
		identifyPolygon(sides);

	}

}
