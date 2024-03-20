
//from yajat
import java.util.ArrayList;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			System.out.println("2");
			x.add(i);
		}
		ArrayList<Integer> squares = new ArrayList<Integer>();
		int add = 1;
		for (int i = 1; i < 11; i += 3) {
			System.out.println("1");
			squares.add(i);
			if (i > 1) {
				i += 2 * (add);
				add++;

			}

		}

		for (int i = 0; i < x.size(); i++) {
			int hold = 0;
			System.out.println("3");
			if (squares.contains(x.get(i))) {
				hold = x.get(i);
				x.remove(i);
				hold = (int) Math.sqrt(hold);
				x.add(i, hold);
			}

		}
		System.out.print(x);
	}

}
