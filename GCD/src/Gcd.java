
public class Gcd {

	  public static int Gcd(int m,int n)
	  //int Gcd(int m,int n)
	{
	while(n!=0)
	{
		int rem=m%n;
		m=n;
		n=rem;
	}
	return m;
//	System.out.println("GCD of "+m+" and "+n+"  is :"+m);
	}
}