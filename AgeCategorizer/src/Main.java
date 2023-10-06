import java.util.Scanner;

public class Main {
	
	public static void categorizeAge(int age)
	{
		if(age>=0 && age<=12)
		{
			System.out.println("Entered age "+age+" is a child " );
		}
		else if(age>12 && age<=19)
		{
			System.out.println("Entered age "+age+" is a Teen");
		}
		else if(age>20 && age<=59)
		{
			System.out.println("Entered age "+age+" is a adult");
		}
		else if(age>=60)
		{
			System.out.println("Entered age "+age+" is a senior");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		categorizeAge(age);

	}

}
