
public class CheckAramstrong {
	static int count(int n)
	{
		int digit=0;
		while(n!=0)
		{
			n=n/10;
			digit++;
		}
		return digit;
	}
	
	static int isArmStrong(int n,int power)
	
	{
		int sum=0;
		if(n==0)
		{
			return 0;
		}
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+(int)Math.pow(rem, power);
			n=n/10;
			
		}
		return sum;
	}

}
