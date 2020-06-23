package by.htp.less.massivmass;

import java.util.Random;

// ћатрицу 10x20 заполнить случайными числами от 0 до 15. 
// ¬ывести на экран саму матрицу и номера строк, в которых число 5 встречаетс€ три и более раз.


public class Task30 {
	
	public static void main(String[] args) {

		int n;
		int m;
		int count;

		n = 10;
		m = 20;

		int[][] mas = new int[n][m];
		int[] mas1 = new int[n];

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

		for (int i = 0; i < mas.length; i++) {
			
			count = 0;
			
			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 5) {

					count++;
				}
			}
			mas1[i] = count;
		}

		System.out.println("Ќомера строк в которых 5 попадаетс€ более 3 раз ");

		for (int i = 0; i < mas1.length; i++) {

			if (mas1[i] > 3) {

				System.out.printf("%4d", i);
			}

		}

	}

}
