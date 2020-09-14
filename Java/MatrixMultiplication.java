import java.util.*;
class MatrixMultiplication{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
	
		int m1 = scan.nextInt();
		int n1 = scan.nextInt();
		int op_holder = 0;
		
	
		int M1[][] = new int[m1][n1];
		
		
	
		 if( m1 >= 1 && n1 <= 200){
	
		for(int i = 0; i < m1; i++){
			for(int j = 0; j < n1; j++ ){
				M1[i][j] = scan.nextInt();
			}
		}
		}
		
		
		
		int m2 = scan.nextInt();
		int n2 = scan.nextInt();
		if( m2 >= 1 && n2 <= 200 && n1 == m2){
		int M2[][] = new int[m2][n2];
		
		
		for(int i = 0; i < m2; i++){
			for(int j = 0; j < n2; j++ ){
				M2[i][j] = scan.nextInt();
			}
		 }
		 int mat3[][] = new int[m1][n2];
		  
		for(int i = 0; i < m1; i++){
			for(int j = 0; j < n2; j++ ){
				for(int k = 0; k < m2; k++){
					op_holder = op_holder + M1[i][k] * M2[k][j];
				}
				mat3[i][j] = op_holder;
				op_holder = 0;
			}
		}
		
		 
		for(int i = 0; i < m1; i++){
			for(int j = 0; j < n2; j++ ){
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
		
		}
	}
}

