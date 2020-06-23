package by.htp.less.massivmass;

import java.util.Random;

// ������� ���������� ������� ������� � �������� ��� �������� �������� �� ����.

public class Task35 {
	
	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 6;

		int max;                                  // ������������ �������� �������� � ������
		int maxValue;                       // ������������ �������� �������� � �������
		int[] maxValueMas = new int[n];   // ������ ���������� �������� ������ ������

		int[][] mas = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(15);

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();

		}

		for (int i = 0; i < mas.length; i++) {    // ����� ������������� �������� � ������ ������

			max = mas[i][0];

			for (int j = 0; j < mas[i].length; j++) {

				if (max < mas[i][j]) {

					max = mas[i][j];

				}
				maxValueMas[i] = max;
			}
		}

		maxValue = maxValueMas[0];

		for (int i = 0; i < maxValueMas.length; i++) {   // ���������� ������������� �������� �������

			if (maxValueMas[i] > maxValue) {

				maxValue = maxValueMas[i];

			}
		}

		System.out.println();
		

		for (int i = 0; i < mas.length; i++) {   //  ������ ������������ ��������� ���� �������� ��������� �������

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] % 2 != 0) {

					mas[i][j] = maxValue;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();

		}

	}


}
