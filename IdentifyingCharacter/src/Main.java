import java.util.Scanner;

public class Main {
	
	public static void identifyCharacter(char ch) 
	{
	//	if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		//{
			//System.out.println("Enter Character "+ch+" is a vowel");
		//}
		//else {
			//System.out.println("Enter Character "+ch+" is a Consonant");
		//}
		 if (Character.isDigit(ch))
		 {
			 System.out.println("Entered Character "+ch+" is a Digit");
		 }
		 else if(!Character.isLetter(ch))
		 {
			 System.out.println("Entered Character "+ch+" is a Special Character");
		 }
		 else
		 {
			 switch(Character.toLowerCase(ch))
			 {
			 case 'a':
			 case 'e':
			 case 'i':
			 case 'o':
			 case 'u':
				 if(Character.isLowerCase(ch))
				 {
					 System.out.println("Entered Character "+ch+" is Lower case vowel ");
				 }
				 else
				 {
					 System.out.println("Entered Character "+ch+" is Upper case vowel ");
				 }
				 break;
				 default:
					 if(Character.isLowerCase(ch))
					 {
						 System.out.println("Entered Character "+ch+" is Lower case Consonant");
					 }
					 else
					 {
						 System.out.println("Entered Character "+ch+" is Upper case Consonant ");
					 }
			 }
		 }
		
		
	}
	
	
	
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
	
}
}
