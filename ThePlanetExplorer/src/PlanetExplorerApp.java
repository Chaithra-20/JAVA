import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double radius=scan.nextDouble();
		double pie=3.142;

		//PlanetExplorer explorer = new PlanetExplorer();

		//System.out.println(explorer.calculateSurfaceArea(3.0));
		
		PlanetExplorer PlanetExplorer=new PlanetExplorer();
			
		System.out.println(PlanetExplorer.calculateSurfaceArea( radius));

	}

}
