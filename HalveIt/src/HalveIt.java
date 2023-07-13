import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double num=scan.nextDouble();
		
		System.out.printf("%.2f",halveTheNumber(num));
		
		
		
	//System.out.printf("%.2f",halveTheNumber(150.00));
	}
	
	public static double halveTheNumber(double num)
	{
		return num/2;
	}

}
