package ConditionalConstruct;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number form 1  to 7 ");
		int day=scan.nextInt();
		
		switch(day)
		{
		case 1 :
			System.out.println(" Its a Super Sunday ");
			break;
			
		case 2 :
			System.out.println("Its a bouring Monday ");
			break;
			
		case 3 :
			System.out.println(" Its a hectic Tuesday ");
			break;
			
		case 4 :
			System.out.println(" Its a fabulous Wednesday ");
			break;
			
		case 5 : 
			System.out.println(" Its a awesome Thursday");
			break;
			
		case 6 :
			System.out.println(" Its a good Friday ");
			break;
			
		case 7 :
			System.out.println(" Its a happy Saturday");
			break;
			
		default:
			System.out.println(" Stupid who had more than 7 days in a week ");	
		}

	}

}
