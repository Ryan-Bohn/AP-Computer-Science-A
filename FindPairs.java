import java.util.ArrayList;

public class FindPairs {

	public static void main(String[] args) {
		
		int[] nums = {4, 4, 9, 2, 4, 9, 10, 4, 15};
		int counter = 0;
		ArrayList<Integer> pairTracker = new ArrayList<Integer>();
		for (int i : nums) {
			if (pairTracker.contains(i)) {
				pairTracker.remove(pairTracker.indexOf(i));
				counter++;
			} else {
				pairTracker.add(i);
			}
		}
		System.out.println(counter);
		
	}

}
