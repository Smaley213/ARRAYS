package by.htp.less.massivmass;

import java.util.Random;

//  � �������� ������� �������� ������� ��� ����� �������, 
//  �. �. ��� �������� ������ ������� ��������� �� ���������������  ��  �������  �������,  
//    �  ��������  �������  �����������  �  ������.  ������  ��������  ������ ������������ � ����������.


public class Task27 {
	
	public static void main(String[] args) {
		
		int n = 10;
		int[][] array = new int[n][n];
		int st1 = 2;
		int st2 = 7;
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) { 
			
			for (int j = 0; j < array.length; j++) {
				
				array[i][j] = rand.nextInt(47);
				
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int temp;
		
		if ((st1 < n) && (st2 < n)) {
			
			for (int i = 0; i<array.length; i++) {
				
				temp = array[i][st1];
				array[i][st1] = array[i][st2];
				array[i][st2] = temp;
			}
		
	    for (int i = 0; i < array.length; i++) {
	    	
			for (int j = 0; j < array.length; j++) {
				
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		}else {
			System.out.println("����� ������� ������ �������, ������� ����� ������ �������");
		}
	}

}
