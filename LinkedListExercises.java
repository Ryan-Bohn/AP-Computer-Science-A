import java.util.*;

public class LinkedListExercises {
	
	public static void main(String[] args) {

	}
	
	public static LinkedList<String> downsize(LinkedList<String> staff) {
		
		ListIterator<String> iterator = staff.listIterator();
		while (iterator.hasNext()) {
			iterator.next();
			if (iterator.hasNext()) {
				iterator.next();
				iterator.remove();
			}
		}
		return staff;
		
	}
	
	public static LinkedList<String> reverse(LinkedList<String> staff) {
		
		ListIterator<String> iterator = staff.listIterator();
		ArrayList<String> names = new ArrayList<String>();
		while (iterator.hasNext()) {
			names.add(iterator.next());
		}
		LinkedList<String> reversed = new LinkedList<String>();
		for (int i = names.size() - 1; i >= 0; i--) {
			reversed.add(names.get(i));
		}
		return reversed;
		
	}

}
