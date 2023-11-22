
public class CountObjects {

	private static int count;
	
	public CountObjects()
	{
		count++;
	}
	
	public static void main(String[] args) {
		
		CountObjects ob1 = new CountObjects();
		CountObjects ob2 = new CountObjects();
		CountObjects ob3 = new CountObjects();
		CountObjects ob4 = new CountObjects();
		CountObjects ob5 = new CountObjects();
		
		System.out.println("Total number of object : "+count);
		
	}



}
