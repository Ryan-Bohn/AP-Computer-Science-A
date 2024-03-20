import java.util.*;

public class StudentArrayLists {

	public static void main(String[] args) {
		
		Student Ryan = new Student("Ryan", 3000, 11);
		Student Yajat = new Student("Yajat", 4000, 11);
		Student Aiman = new Student("Aiman", 5000, 12);
		Student Yajat2 = new Student("Yajat", 4000, 11);
		ArrayList<Student> firstStudents = new ArrayList<Student>();
		firstStudents.add(Ryan);
		firstStudents.add(Yajat);
		firstStudents.add(Aiman);
		firstStudents.add(Yajat2);
		
		ArrayList<Student> secondStudents = new ArrayList<Student>();
		secondStudents.add(Aiman);
		secondStudents.add(Ryan);
		secondStudents.add(Yajat2);
		secondStudents.add(Yajat2);
		
		System.out.print(isEqual(firstStudents, secondStudents));
		
	}
	
	public static boolean isEqual(ArrayList<Student> a1, ArrayList<Student> a2) {
		
		if(a1.size() != a2.size()) {
			return false;
		}
		int size = a1.size();
		ArrayList<Integer> usedIndices = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (a1.get(i).equals(a2.get(j)) && !usedIndices.contains(j)) {
					usedIndices.add(j);
					break;
				}
				if (j == size - 1) {
					return false;
				}
			}
		}
		return true;
		
	}

}
