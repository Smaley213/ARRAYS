package by.htp.less.massivmass;

//#17 ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
//| 1  1  1  ... 1  1  1|
//| 1  0  0  ... 0  0  1|
//| 1  0  0  ... 0  0  1|
//| 1  0  0  ... 0  0  1| 
//| 1  0  0  ... 0  0  1|
//| 1  1  1  ... 1  1  1|

public class Task17 {
	
	public static void main(String[] args) {
		
		int a = 7;               // �������� ���������� � �������
		int b = 7;
		int mas[][] = new int[a][b];
		
		for (int i = 0; i < mas.length; i++) {
		  mas[i][0] = 1;
		  mas[i][mas.length -1] = 1;
		}
		for (int j = 0; j < mas.length - 1; j++) {
			
			mas[0][j] = 1;
			mas[mas.length - 1][j] = 1;
		}
		  
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}


}
