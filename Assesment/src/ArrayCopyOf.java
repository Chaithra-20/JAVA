import java.util.Arrays;

public class ArrayCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int arr[]=new int[]{5,6,7,10,17};
		System.out.println("Original Array");
		for(int num:arr)
		{
		System.out.println(num+ " ");
		}
		int new_arr[]=Arrays.copyOf(arr,4);
		System.out.println("\nNew Array");
		for(int num:new_arr)
		{
		System.out.println(num+ " ");


	}

}
}

