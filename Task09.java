package by.htp.less.massivmass;

import java.util.Random;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task09 {
	
	public static void main(String[] args) {
		
		int m = 5;
		int n = 5;
		
		int[][] array = new int[m][n];
		Random rand = new Random();
		
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				array[i][j] = rand.nextInt(47);
				
				//System.out.print(array[i][j] + " ");
			}
			//System.out.println();
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i][i] + " ");
			System.out.println();
		}

	}


}
