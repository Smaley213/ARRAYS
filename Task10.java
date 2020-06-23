package by.htp.less.massivmass;

import java.util.Random;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {
	
	public static void main(String[] args) {
		
		int m = 5;
		int n = 5;
		int k = 3;
		int p = 3;
		
		int[][] array = new int[m][n];
		Random rand = new Random();
		
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				array[i][j] = rand.nextInt(47);
			}
		}
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[k][i] + " ");
			
		}
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i][p] + " ");
			System.out.println();
		}

	}

}
