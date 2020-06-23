package by.htp.less.massivmass;

// ������������ ���������� ������� ������� n �� ��������� �������(n - ������): 

//| 1  1  1  ... 1  1  1|
//| 2  2  2  ... 2  2  0|
//| 3  3  3  ... 3  0  0|
//| 4  4  4  ... 0  0  0| 
//| 5  5  0  ... 0  0  0|
//| 6  0  0  ... 0  0  0|

public class Task18 {
	
	public static void main(String[] args) {

		int n;
		int m;

		n = 7;
		m = 7;

		int mas[][] = new int[n][m];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j + i < n; j++) {

				mas[i][j] = i + 1;

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