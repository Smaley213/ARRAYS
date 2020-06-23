package by.htp.less.massivmass;

import java.util.Random;

// Дана матрица. Вывести на экран первую и последнюю строки.

public class Task04 {
    public static void main(String args[]) {
    	
    	int [][] mas = new int [3][4];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(20);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][0] + " ");
			}
		
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			
		System.out.print(mas[i][mas[i].length - 1] + " ");
		}

    }

} 
/* public static void main(String args[]) {

int n = 6, m = 4;
int mas [][] = new int[n][m];

Random rand = new Random();

for (int i = 0 ; i < mas.length; i++){
	
	for (int j = 0 ; j < mas[i].length; j++){
		
	mas[i][j] = rand.nextInt(10);
	
}
}


	for (int j = 0 ; j < mas[mas.length - 1].length; j++){
		System.out.print(mas[0][j] + " ");
		
}
	System.out.println();	
	
	for (int j = 0 ; j < mas[mas.length - 1].length; j++){
		System.out.print(mas[mas.length - 1][j] + " ");
		
}
	System.out.println();	


}
} */
