package by.htp.less.massivmass;

import java.util.Random;

// Найдите произведение двух матриц.

public class Task39 {
	
	public static void main(String[] args) {

		int n;     // Создание переменных
		int m;

		n = 4;     // Присваивание значений переменных
		m = 4;

		int[][] mas = new int[n][m];         // Создание массивов ,выделение памяти под массивы
		int[][] mas1 = new int[n][m];
		int[][] compositionMas = new int[n][m];

		Random rand = new Random();        //  Наш рандомайзер

		for (int i = 0; i < mas.length; i++) {// далее цыклы для решения задачи прохождение по сторонам массива

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(15);

			}
		}
		System.out.println("Матрица А ");
		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();

		}

		for (int i = 0; i < mas1.length; i++) {

			for (int j = 0; j < mas1[i].length; j++) {

				mas1[i][j] = rand.nextInt(20);

			}
		}

		System.out.println();
		System.out.println("Матрица Б ");
		System.out.println();

		for (int i = 0; i < mas1.length; i++) {

			for (int j = 0; j < mas1[i].length; j++) {

				System.out.printf("%4d", mas1[i][j]);

			}

			System.out.println();

		}

		System.out.println();
		System.out.println("Произведение А и Б ");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				for (int k = 0; k < mas.length; k++) {

					compositionMas[i][j] += mas[i][k] * mas1[k][j];
				}
			}
		}

		System.out.println();

		for (int i = 0; i < compositionMas.length; i++) {

			for (int j = 0; j < compositionMas[i].length; j++) {

				System.out.printf("%4d", compositionMas[i][j]);

			}

			System.out.println();

		}

	}

}
