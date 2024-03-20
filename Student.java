
public class Student {
	
	private String name;
	private int studentID;
	private int grade;
	
	public Student(String name, int studentID, int grade) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}
	
	public boolean equals(Student s) {
		return s.getName().equals(name) && s.getStudentID() == studentID && s.getGrade() == grade;
	}
	
}
