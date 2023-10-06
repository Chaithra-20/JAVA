
public class CharWrapIsDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1=':';
		char ch2='w';
		char ch3='8';
		
		boolean b1= Character.isDigit(ch1);
		boolean b2= Character.isDigit(ch2);
		boolean b3= Character.isDigit(ch3);
		
		System.out.println(ch1+ " is Digit:?? "+b1);
		System.out.println(ch2+ " is Digit:?? "+b2);
		System.out.println(ch3+ " is Digit:?? "+b3);
	}

}
