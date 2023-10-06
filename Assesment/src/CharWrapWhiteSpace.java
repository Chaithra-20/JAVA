
public class CharWrapWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='\n';
		char ch2='d';
		char ch3='\t';
		
		boolean b1= Character.isWhitespace(ch1);
		boolean b2= Character.isWhitespace(ch2);
		boolean b3= Character.isWhitespace(ch3);
		
		System.out.println(ch1+ " is java Whitespace:?? "+b1);
		System.out.println(ch2+ " is java Whitespace:?? "+b2);
		System.out.println(ch3+ " is java Whitespace:?? "+b3);
	}

}
