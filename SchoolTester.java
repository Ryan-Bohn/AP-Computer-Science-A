
public class SchoolTester {

	public static void main(String[] args) {
		
		School lz = new School("Lake Zurich High School");
		lz.add("Ryan", 4.0);
		lz.add("Yajat", 4.0);
		lz.add("Nikko", 4.0);
		lz.add("Manit", 4.0);
		lz.remove("Nikko");
		lz.remove("Yajat");
		System.out.println(lz);

	}

}
