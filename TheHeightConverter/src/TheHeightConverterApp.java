import java.util.Scanner;

public class TheHeightConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double inches=scan.nextDouble();
		
		TheHeightConverter converter= new TheHeightConverter();
		System.out.printf("%.2f",converter.convertInchesToFeet(inches));
		
		
		//TheHeightConverter converter = new TheHeightConverter();

		//System.out.println(converter.convertInchesToFeet(72.0));

	}

}
