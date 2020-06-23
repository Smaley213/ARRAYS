package by.htp.less.massivmass;

import java.util.Random;

// Ќайти положительные элементы главной диагонали квадратной матрицы.

public class Task29 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int[][] array = new int[n][n];
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) { 
			
			for (int j = 0; j < array.length; j++) {
				
				array[i][j] = rand.nextInt();
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i][i] > 0) {
				System.out.print(array[i][i] + " ");
			}
		}

	}

}
