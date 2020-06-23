package by.htp.less.massivmass;

import java.util.Random;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

public class Task06 {
    public static void main(String args[]) {
    	
    	int n = 6, m = 4;
		int mas [][] = new int[n][m];
		
		Random rand = new Random();
		
		for (int i = 0 ; i < mas.length; i++){
			
			for (int j = 0 ; j < mas[i].length; j++){
				
			mas[i][j] = rand.nextInt(10);
			
		}
	}
		

		for (int i = 0 ; i < mas.length; i++){

			for (int j = 0 ; j < mas[i].length; j++){
				if(j % 2 == 1 && mas[0][j] > mas[mas.length - 1][j]) {
				
				System.out.print(mas[i][j] + " ");
				}
				
				}
			System.out.println();	
      }
    	
    }

}
