package GroupTask;

public class Project6 {

	public static void main(String[] args) {
		int[][] array = {
				{ 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(sum);

	}

}
