package jun16;

public class Good {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 45, 50, 75 }, { 89 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
