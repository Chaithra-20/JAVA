import java.util.Scanner;

public class StringsDemo {
	public static void main(String[] args) {
		//String s1="Chaithra";
		//System.out.println(s1);
		//StringBuilder sd=new StringBuilder("CHIRAG");
//		System.out.println(sd);
//		sd.reverse();
//		System.out.println(sd);
		
		Scanner scan=new Scanner(System.in);
		char arr[]=new char[10];
		for(int i=0;i<=arr.length-1;i++)
		{
			
			arr[i]=scan.next().charAt(0);
		}
		System.out.println("arr---->");
		for (char c : arr) {
			System.out.print(c+" ");
		}
		System.out.println();
		char arr2[]=new char[10];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[i]=arr[i];
			
		}
		System.out.println("arr2--->");
		for (char d : arr2) {
			System.out.print(d+" ");
		}
		System.out.println();
		char arr3[]=new char[10];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr3[i]=arr2[i];
			
		}
		System.out.println("arr3-->");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr3[i]+" ");
		
		}
		
		
	}

}
