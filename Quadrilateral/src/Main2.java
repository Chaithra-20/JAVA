import java.util.Scanner;

public class Main2 {
	
	public static void identifyPolygon(int sides)
	{
		switch(sides)
		{
		case 3: System.out.println("TRIANGLE");
		break;
		case 4: System.out.println("QUADRILATERAL");
		break;
		case 5: System.out.println("POLYGON");
		break;
		case 6: System.out.println("HEXAGON");
		break;
		default: System.out.println("polygon");
		break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sides=scan.nextInt();
		identifyPolygon(sides);
	}

}
