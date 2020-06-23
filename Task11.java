package by.htp.less.massivmass;

import java.util.Random;

// Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, 
// вторая строка слева направо, третья строка справа налево и так далее.

public class Task11 {

	public static void main(String[] args) {
		int m = 5;
		int n = 5;
		int[][] array = new int[m][n];
		Random rand = new Random();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = rand.nextInt(47);
			}
		}
		for (int i = 0; i < m; i++) {
			if (i % 2 == 0) {
				for (int j = n; j > 0; j--) {
					System.out.print(array[i][j-1] + " ");
				}
			}else {
				for (int j = 0; j < n; j++) {
					System.out.print(array[i][j] + " ");
				}
			}
		System.out.println();
		}

	}

}
