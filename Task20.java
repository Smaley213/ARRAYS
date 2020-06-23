package by.htp.less.massivmass;

// ������������ ���������� ������� ������� n �� ��������� �������(n - ������): 

//| 1  0  0  ... 0  0  1|
//| 1  1  0  ... 0  1  1|
//| 1  1  1  ... 1  1  1|
//| 1  1  1  ... 1  1  1| 
//| 1  1  0  ... 0  1  1|
//| 1  0  0  ... 0  0  1|

public class Task20 {
	
	public static void main(String[] args) {

		int n;
		int m;

		n = 8;
		m = 8;

		int mas[][] = new int[n][m];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length; j++) {

				if (i < j && i + j >= n) {

					mas[i][j] = 1;
				}
				if (i > j && i + j < n) {

					mas[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			mas[i][i] = 1;

		}

		int k;
		k = mas.length - 1;

		for (int i = 0; i < mas.length; i++) {

			mas[i][k] = 1;

			k--;
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

	}


}
