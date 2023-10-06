import java.util.Scanner;

public class FindQuadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		PrintQuadrant printQuadrant=new PrintQuadrant();
		printQuadrant.checkQuadrant(x, y);

	}

}
