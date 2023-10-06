import java.util.Scanner;

public class Main2 {

	public static void identifyCharacter(char ch) 
	{
		if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Enter Character "+ch+" is a vowel");
		}
		else {
			System.out.println("Enter Character "+ch+" is a Consonant");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	
	}

}
