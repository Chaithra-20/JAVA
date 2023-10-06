 
public class Prime {
	public static int printPrime(int n)
	{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return 0;
		}
		
	}
	return n;
	}

}
