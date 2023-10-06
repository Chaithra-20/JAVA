
public class Harshad {
	boolean isHarshad(int num)
	{
		int copy=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(copy%sum==0)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

}
