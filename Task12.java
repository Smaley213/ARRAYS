package by.htp.less.massivmass;

// ѕолучить квадратную матрицу пор€дка n:

public class Task12 {
	
    public static void main(String[] args) {
		
		int n = 5;
		int[][] array = new int[n][n];
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				array[i][j] = 0;
				
				//System.out.print(array[i][j] + " ");
			}
			//System.out.println()
		}
		
		for (int i = 0; i < array.length; i++) {
			array[i][i] = i;
		}
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
