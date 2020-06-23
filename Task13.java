package by.htp.less.massivmass;

// —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):

public class Task13 {
	public static void main(String[] args) { 
		
		int n = 4;
		int[][] array = new int[n][n];
		
		if (n % 2 == 0) {
			
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				array[i][j] = j+1;
				//System.out.print(array[i][j] + " ");
			}
			//System.out.println();
		}
		
		for (int i = 0; i < array.length; i++) {
			
			if (i % 2 != 0) {
				
				for (int j = array.length; j > 0; j--) {
					
					System.out.print(array[i][j-1] + " ");
				}
			}else {
				for (int j = 0; j < array.length; j++) {
					
					System.out.print(array[i][j] + " ");
				}
			}
		System.out.println();
		
		}
		}else {
			System.out.println("n четное!");
		}
	}

}
