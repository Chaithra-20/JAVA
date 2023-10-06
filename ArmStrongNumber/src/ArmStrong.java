

public class ArmStrong {
	public int printArmStrong(int n)
	{
		int digit=0;
		int sum=0;
		int copy=n;
		
		while(n!=0)
		{
			n=n/10;
			digit++;
			
		}
		while(copy!=0)
		{
			int rem=copy%10;
			sum=sum+ (int)Math.pow(rem,digit);
			copy=copy/10;
		}
		return sum;
	}

}
