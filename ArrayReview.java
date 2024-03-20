
public class ArrayReview {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = ((int) (Math.random() * 10)) + 1;
				System.out.print(arr[i][j] + "\t");
				rowSum += arr[i][j];
			}
			System.out.println(rowSum + "\n");
			totalSum += rowSum;
		}

		for (int j = 0; j < arr[0].length; j++) {
			int colSum = 0;
			for (int i = 0; i < arr.length; i++) {
				colSum += arr[i][j];
			}
			System.out.print(colSum + "\t");
			totalSum += colSum;
		}
		System.out.print(totalSum);

	}

}
