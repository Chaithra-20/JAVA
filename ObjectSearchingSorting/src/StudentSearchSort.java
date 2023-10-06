
public class StudentSearchSort {
	static boolean studentLinearSearch(Student arr[],String nameKey)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i].name.equals(nameKey))
			{
				System.out.println("Student found");
				return true;
			}
		}
		return false;
	}
	static public void studentBubbleSort(Student arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j].id>arr[j+1].id)
				{
					Student temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void studentInsertionSort(Student arr[])
	{
		for(int i=1;i<=arr.length-2;i++)
		{
			int item=arr[i].id;
			int j=i-1;
			while(j>=0 && arr[j].id>item)
			{
				arr[j+1].id=arr[j].id;
				j--;
			}
			arr[j+1].id=item;
		}
	}
	public static void studentSelectionSort(Student arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i].id;
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j].id<min)
				{
					min=arr[j].id;
					pos=j;
				}
				int help=arr[i].id;
				arr[i].id=arr[pos].id;
				arr[pos].id=help;
			}
		}
	}
	public static boolean studentBinarySearch(Student arr[],int idKey)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid].id==idKey)
			{
				System.out.println("Studnet id found and the name is "+arr[mid].name);
				return true;
			}
			else if(idKey>arr[mid].id)
			{
				low=mid+1;
				
			}
			else
			{
				high=mid-1;
			}
		}
		return false;
	}
	static public void studentArrayPrint(Student[]arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+"|");
		}
	}
	static public void studentAppRatingPrint(int noofstars)
	{
		for(int i=1;i<=noofstars;i++)
		{
			System.out.print("* ");
		}
	}

}
