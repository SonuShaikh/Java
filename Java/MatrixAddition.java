import java.util.*;
class MatrixAddition{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int mat1[][] = new int[m][n];
		int mat2[][] = new int[m][n];
		int mat3[][] = new int[m][n];
		
	
		 if( m >= 1 && n <= 200){
			 // matrix 1
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++ ){
				mat1[i][j] = scan.nextInt();
			}
		}
		
		// matrix 2
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++ ){
				mat2[i][j] = scan.nextInt();
			}
		}
		
		// Addition Matrix
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++ ){
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		// Printing Sumation
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++ ){
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
		 }
		
	}
}