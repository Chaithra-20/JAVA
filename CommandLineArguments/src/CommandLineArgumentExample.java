
public class CommandLineArgumentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=args.length-1;i++)
		{
			System.out.println(args[i]+" ");
		}
		System.out.println();
		String sum="0";
		for(int i=0;i<=args.length-1;i++)
		{
			sum=sum+args[i];
		}
		System.out.println(sum);
		System.out.println();
		int sum1=0;
		for(int i=0;i<=args.length-1;i++)
		{
			sum1=sum1+Integer.valueOf(args[i]);
		}
		System.out.println(sum1);
		
	}

}
