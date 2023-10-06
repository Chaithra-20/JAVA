
public class Calc {
	public void add(int...numbers)
	{
		int sum=0;
		for (int i : numbers) 
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		
	}

}
