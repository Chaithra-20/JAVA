
public class ArmStrong {
	int isArmStrong(int n)
	{
		int copy=n;
		int sum=0;
		int digit=0;
		while(n!=0)
		{
			n=n/10;
			digit++;
		}
		
		while(copy!=0)
		{
			int rem=copy%10;
			sum=sum+(int)Math.pow(rem, digit);
			copy=copy/10;
		}
		return sum;
	}

}
