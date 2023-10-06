
public class StrongNum {

	int findFact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	boolean isStrong(int n)
	{
		int copy=n;
		int sum=0;
		int digit=0;
		
		while(copy!=0)
		{
			digit=copy%10;
			sum=sum+findFact(digit);
			copy=copy/10;
		}
		if(sum==n)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
}
