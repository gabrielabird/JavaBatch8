package GroupTask;

public class Project8 {

	public static void main(String[] args) {
		int [][] odd = {
				{2,4,6,8},
				{1,3,5,7},
				{20,21,22,23},
				{111,69,46,88}
				};
				for(int[] odds:odd) {
					for(int number:odds) {
						if(number%2==1) {
							System.out.print(number+" ");
						}
					}
				}

	}

}
