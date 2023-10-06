import java.util.Scanner;

public class HeightsOfPlayers {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			Float arr[]= new Float [7];
			System.out.println("Enter the Height of players....");
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i]=scan.nextFloat();
			}
			System.out.println("PLayers height are...");
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i]+ " ");
			}
		

	}

}
