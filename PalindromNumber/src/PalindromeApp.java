import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		Palindrome palindrome=new Palindrome();
		int rev=palindrome.reverseNumber(n);
		System.out.println("Reverse of Number "+n+" is "+rev);
		if(n==rev)
		{
			System.out.println("Entered number is palindrome");
		}
		else
		{
			System.out.println("Reverse number is not a palindrome");
		}
		
		scan.close();
	}

}

