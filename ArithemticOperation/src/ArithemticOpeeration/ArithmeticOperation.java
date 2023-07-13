package ArithemticOpeeration;

public class ArithmeticOperation {

	public static void main(String[] args) {
		int result=subtractNumbers(20,5);
		int result1=multiplyNumbers(4,5);
		double result2=divideNumbers(20,4);
		int result3=findRemainder(10,3);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.printf("%.2f\n",result2);
		System.out.println(result3);
		
		
	}
	public static int subtractNumbers(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1,int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1,int num2)
	{
		return num1/num2;
		
	}
	public static int findRemainder(int num1,int num2)
	{
		return num1%num2;
	}
}
