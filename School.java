import java.util.ArrayList;

public class School {

	private String schoolName;
	private ArrayList<Student> students;

	School(String name) {

		schoolName = name;
		students = new ArrayList<Student>();

	}

	public void add(String name, double gpa) {

		students.add(new Student(name, gpa));

	}

	public void remove(String name) {

		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getName().equals(name)) {

				students.remove(i);
				return;

			}

		}

	}

	public String toString() {

		String names = "";
		for (Student s : students) {

			names += s.getName() + "  ";

		}
		return names;

	}

}