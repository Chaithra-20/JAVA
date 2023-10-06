import java.util.Scanner;

public class PowerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int base=scan.nextInt();
		int power=scan.nextInt();
		
		//Using inbuilt function
		int res1=(int)Math.pow(base,power);
		System.out.println("The result of the number "+base+" to the power of "+power+" is "+res1);

		
		//without using inbuilt function
		int res2=Mathematics.powerValue(base,power);
		System.out.println("The result of the number "+base+" to the power of "+power+" is "+res2);
	}

}
