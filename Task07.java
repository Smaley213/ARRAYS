package by.htp.less.massivmass;

import java.util.Random;

//Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task07 {

    	
	public static void main(String[] args) {
		int m = 5;
		int n = 5;
		int[][] array = new int[m][n];
		Random rand = new Random();
		int sum = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = rand.nextInt();
				if (array[i][j] < 0) {
					sum = sum + (int)Math.abs(array[i][j]);
				}
				//System.out.print(array[i][j] + " ");
			}
			//System.out.println();
		}
		System.out.println(sum);

	}


}
