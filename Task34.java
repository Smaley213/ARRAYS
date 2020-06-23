package by.htp.less.massivmass;

// —формировать случайную матрицу m x n, состо€щую из нулей и единиц, причем в единиц равно номеру столбца. 

public class Task34 {
	
	public static void main(String[] args) {

		int n;
		int m;

		n = 5;
		m = 5;

		int mas[][] = new int[n][m];

		for (int i = mas.length - 1; i >= 0; i--) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = 0;

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = mas[i].length - 1; i <= j; j--) {

				mas[i][j] = 1;

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}


}
