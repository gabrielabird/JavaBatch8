package GroupTask;

public class Project9 {

	public static void main(String[] args) {
		int sum = 0;
		String[][] country = { { "Mex", "USA", "Can" }, { "Ecu", "Arg", "Bol", "Chile" },
				{ "Neth", "Ire", "Germ", "Italy" }, { "Gha", "Nigeria", "Cam", "Eritrea" },
				{ "Japan", "S.Kor", "Phil", "Afgh" } };
		for (int i = 0; i < country.length; i++) {
			for (int j = 0; j < country[i].length; j++) {
				System.out.print(country[i][j] + "   ");
				sum = country.length * country[j].length - 1;
			}
			System.out.println();
		}
		System.out.println(sum);

	}

}
