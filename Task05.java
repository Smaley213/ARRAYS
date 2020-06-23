package by.htp.less.massivmass;

import java.util.Random;

// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class Task05 {
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
    				
    				if((i + 2) % 2 == 0 ) {
    					
    				System.out.print(mas[i][j] + " ");}
    				
    		}
    			System.out.println();}
     
    }

}
