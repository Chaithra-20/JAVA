
public class CountObjects2 
{
	static int count=0;
	static void count()
	{
		count++;
	}
	
	public static void main(String[] args) {
		CountObjects2 cb1 = new CountObjects2();
		cb1.count();
		CountObjects2 cb2 = new CountObjects2();
		cb2.count();
		CountObjects2 cb3 = new CountObjects2();
		cb3.count();
		
		System.out.println("Total Number of objects : "+count);
	}
}
