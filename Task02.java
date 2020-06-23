package by.htp.less.massivmass;

// Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

import java.util.Random;

public class Task02 {
	public static void main(String[] args) {
		
		int n = 2, m = 3;
		int mas [][] = new int[n][m];
		
		
		Random rand = new Random();
		
		for (int i = 0 ; i < mas.length; i++){
			
			for (int j = 0 ; j < mas[i].length; j++){
				
			mas[i][j] = rand.nextInt(10);
			
		}
	}
     
		for (int i = 0 ; i < mas.length; i++){
			
			for (int j = 0 ; j < mas[i].length; j++){
				
				System.out.print(mas[i][j] + " ");
				
		}
			System.out.println();	
	}
		
	}

}
