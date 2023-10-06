import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[] { "Java","C","C++","Python"};
		List<String> list=Arrays.asList(arr);
		System.out.println("List: " +list);
	}

}
