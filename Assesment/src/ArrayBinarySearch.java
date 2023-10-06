import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={2,6,7,8,13,19,27,55,80};
		int key=19;
		int index=Arrays.binarySearch(array,key);
		System.out.println(key+ " found at index: " +index);


	}

}
