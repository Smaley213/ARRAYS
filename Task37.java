package by.htp.less.massivmass;

import java.util.Random;

//  ����������� ������ ������� ��������� �������.

public class Task37 {
	
	public static void main(String[] args) {

		int n;   // �������� ����������
		int m;
		int k;
		int q;

		n = 7;    // ���������� �������� ����������
		m = 7;

		int mas[][] = new int[n][m];   // �������� �������� � ��������� ������ ��� ��� 
		int mas1[] = new int[n];
		int mas2[] = new int[n];

		Random rand = new Random();    // ��� ����������� )

		k = rand.nextInt(n);
		q = rand.nextInt(n);

		for (int i = 0; i < mas.length; i++) {     // ����� ����� 

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(10);

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) {

			mas1[i] = mas[i][k];
		}

		for (int i = 0; i < mas.length; i++) {

			mas2[i] = mas[i][q];
		}

		for (int i = 0; i < mas.length; i++) {

			mas[i][q] = mas1[i];
			mas[i][k] = mas2[i];
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

	}


}
