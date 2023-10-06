
public class Abundant {
	boolean isAbundant(int num)
	{
		int copy=num;
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(sum>copy)
		{
			return true;
		}
		return false;
	}

}
