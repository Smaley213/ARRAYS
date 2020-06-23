package by.htp.less.massivmass;

import java.util.Random;

// Найдите сумму двух матриц

public class Task38 {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		int array1[][] = new int[n][n];
		int array2[][] = new int[n][n];
		int array3[][] = new int[n][n];
		
		Random rand = new Random();
		
		for (int i = 0 ; i < array1.length; i++){
			
			for (int j = 0 ; j < array1.length; j++){
				array1[i][j] = rand.nextInt(15);
			}
		}
		
		for (int i = 0 ; i < array2.length; i++){
			
			for (int j = 0 ; j < array2.length; j++){
				array2[i][j] = rand.nextInt(15);
			}
		}
		
		for (int i = 0 ; i < array3.length; i++){
			
			for (int j = 0 ; j < array3.length; j++){
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		
		for (int i = 0; i < array3.length; i++) {
			
			for (int j = 0; j < array3.length; j++) {
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}


	}

}
