package by.htp.less.massivmass;

import java.util.Random;
import java.util.Scanner;

//  � ���������� �������� ��������� ������ ����� ������������ nxm. 
//    ��������� � �������� ��������� ��������:  
// �) ��������� ����� ������������� ��������� � ������ ������;  
// �) ���������� ������������ ������� � ������ ������;  
// �) ����������� ������� ������������ � ����������� �������� �������.

public class Task26 {
	
	public static void main(String[] args) {

		int n;
		int m;
		int max;      // ������������ �������� �������� � ������
		int min;      // ����������� �������� �������� � ������
		int maxValue;  // ������������ �������� �������� � �������
		int minValue;  // ����������� �������� �������� � �������
		int positionMax;  // ������� ������������� �������� � �������
		int positionMin;  // ������� ������������ �������� � �������

		positionMax = 0;
		positionMin = 0;

		max = 0;
		min = 0;

		n = scannerInt();
		m = scannerInt();

		int[] maxIndex = new int[n];     // ������ �������� ������� � ���������� ��������� ��������
		int[] minIndex = new int[n];     // ������ �������� ������� � ���������� ��������� ��������
		int[] minValueMas = new int[n];   // ������ ���������� �������� ������ ������
		int[] maxValueMas = new int[n];   // ������ ���������� �������� ������ ������

		int mas[][] = new int[n][m];    // �������� ������

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = scannerInt();

			}
		}

		System.out.println("���� ������� ");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%5d", mas[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) {    // ����� ������������� ��������� � ������ ������

			int sum;
			sum = 0;

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] < 0) {

					sum = sum + mas[i][j];
				}
			}

			if (Math.abs(sum) > 0) {

				System.out.println("����� ������������� ��������� " + (i + 1) + " c����� ����� " + sum);

			} else {
				System.out.println("� " + (i + 1) + " ������ ��� ������������� ���������!");
			}
		}

		for (int i = 0; i < mas.length; i++) {       // ����� ������������� �������� � ������ ������

			max = mas[i][0];

			for (int j = 0; j < mas[i].length; j++) {

				if (max < mas[i][j]) {

					max = mas[i][j];

					maxIndex[i] = j;

				}
				maxValueMas[i] = max;
			}

			System.out.println("������������ ������� � " + (i + 1) + " c����� ����� " + max);

		}

		for (int i = 0; i < mas.length; i++) {      // ����� ������������ �������� � ������ ������

			min = mas[i][0];

			for (int j = 0; j < mas[i].length; j++) {

				if (min > mas[i][j]) {

					min = mas[i][j];

					minIndex[i] = j;

				}
				minValueMas[i] = min;
			}

			System.out.println("����������� ������� � " + (i + 1) + " c����� ����� " + min);

		}

		maxValue = maxValueMas[0];

		for (int i = 0; i < maxValueMas.length; i++) {    // ���������� ������������� �������� �������

			if (maxValueMas[i] > maxValue) {

				maxValue = maxValueMas[i];

				positionMax = i;
			}
		}

		minValue = minValueMas[0];

		for (int i = 0; i < minValueMas.length; i++) {    // ���������� ������������ �������� �������

			if (minValueMas[i] < minValue) {

				minValue = minValueMas[i];

				positionMin = i;
			}
		}

		mas[positionMax][maxIndex[positionMax]] = minValue;    // ������ ������������� �������� ��������� ������������

		mas[positionMin][minIndex[positionMin]] = maxValue;   // ������ ������������ �������� ������� ���������
															// �������������

		System.out.println();

		System.out.println("������� ����� ������ ������������� �� ����������� ������� � �������� ");

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%5d", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static int scannerInt() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int number;

		System.out.println("������� �����: \r");

		while (!in.hasNextInt()) {

			in.next();

			System.out.println("������������ ����!\r ");
			System.out.println("������� �����: \r");
		}
		number = in.nextInt();

		return number;

	}

}
