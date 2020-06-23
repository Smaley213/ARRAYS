package by.htp.less.massivmass;

//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
//вывести на экран.

public class Task01 { 
	public static void main(String[] args) {
		
	
		
	int n = 2, m = 3;
	int mas [][] = new int[n][m];
	
	for (int i = 0 ; i < mas.length; i++){
		
		for (int j = 0 ; j < mas[i].length; j++){
			
		mas[0][j] = 1;
		
	}
}
	
	for (int i = 1 ; i < mas.length; i++){
		
		for (int j = 0 ; j < mas[i].length; j++){
			
		mas[i][j] = 0;
		
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
