import java.util.*;

public class ArrayListReview {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("foo");
		arr.add("bar");
		arr.add(1, "baz");
		System.out.println(arr);
		arr.remove("foo");
		System.out.println(arr);
		int index = arr.indexOf("bar");
		arr.remove(index);
		arr.add(index, "cat");
		System.out.println(arr);

	}

}
