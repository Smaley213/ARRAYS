package by.htp.less.massivmass;

import java.util.Random;

//  Задана матрица неотрицательных чисел. 
//  Посчитать сумму элементов в каждом столбце .Определить, какой столбец содержит максимальную сумму

public class Task28 {
	
	public static void main(String[] args) { 
		
		int m = 7;
		int n = 8;
		int[][] array = new int[m+1][n];
		Random rand = new Random();
		
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				array[i][j] = rand.nextInt(15);
			}
		}
		
		int max = 0;
		
		for (int j = 0; j < n; j++) {
			
			int sum = 0;
			
			for (int i = 0; i < m; i++) {
				
				sum = sum + array[i][j];
				
				array[m][j] = sum;
				
				if (array[m][j] > max) {
					max = array[m][j];
				}
			}
		}
		System.out.println("Максимальная сумма в столбце: " + max);
		
		System.out.println();
		
		for (int i = 0; i <= m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
