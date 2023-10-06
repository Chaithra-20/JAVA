
import java.util.Arrays;

public class ArraysCopyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={17,32,44,99,29,22,5,34,65,33,74,14,32};
		int new_array[]=Arrays.copyOfRange(arr,3,11);
		for(int num:new_array)
		System.out.println(num+ " ");

	}

}
