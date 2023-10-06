import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of objects to be created");
		int n=scan.nextInt();
		Student arr[]=new Student[n];
		
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Enter the id");
				int id=scan.nextInt();
				System.out.println("Enter name");
				String name=scan.next();
				System.out.println("Enter marks");
				int marks=scan.nextInt();
				arr[i]=new Student(id,name,marks);
			}
			StudentSearchSort.studentArrayPrint(arr);
			System.out.println();
			System.out.println("Enter the name to Search");
			String nameKey=scan.next();
			boolean res=StudentSearchSort.studentLinearSearch(arr, nameKey);
			if(!res)
			{
				System.out.println("Student not found");
			}
			System.out.println();
			System.out.println("Enter true if you wish to sort else enter false");
			boolean choice=scan.nextBoolean();
			if(choice)
			{
				System.out.println();
				System.out.println("1----->BUBBLE SORT");
				System.out.println("2----->SELECTION SORT");
				System.out.println("3----->INSERTION SORT");
				System.out.println("ANY OTHER-----> BUBBLE SORT");
				int option=scan.nextInt();
				switch(option)
				{
				case 1:StudentSearchSort.studentBubbleSort(arr);
						break;
				case 2:StudentSearchSort.studentSelectionSort(arr);
						break;
				case 3:StudentSearchSort.studentInsertionSort(arr);
						break;
				default:StudentSearchSort.studentBubbleSort(arr);
						break;
				}
				
			}
			StudentSearchSort.studentArrayPrint(arr);
			System.out.println();
			System.out.println("Enter id to search");
			int idKey=scan.nextInt();
			res=StudentSearchSort.studentBinarySearch(arr, idKey);
			if(!res)
			{
				System.out.println("Student not found");
			}
			System.out.println("Rate the Application....out of 10");
			int noofstars=scan.nextInt();
			System.out.println("Thanks for Rating us with ");
			StudentSearchSort.studentAppRatingPrint(noofstars);
	}
}