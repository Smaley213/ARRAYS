package by.htp.less.massivmass;

import java.util.Random;

//Дан двухмерный массив n×m элементов. 
//Определить, сколько раз встречается число 7 среди элементов массива

public class Task08 {
    public static void main(String args[]) {
    	
    		
    		int m = 5;
    		int n = 7;
    		int[][] array = new int[m][n];
    		Random rand = new Random();
    		int count = 0;
    		
    		for (int i = 0 ; i < m; i++){
    			for (int j = 0 ; j < n; j++){	
    			array[i][j] = rand.nextInt(10);
    				if (array[i][j] == 7) {
    					count++;
    				}
    			}
    		}
    		System.out.println(count);


    	}


}
