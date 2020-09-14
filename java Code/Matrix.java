// Printe Matrix
import java.util.*;
class Matrix{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total number of rows of matrix");
		int rows = s.nextInt();
		System.out.println("Enter total number of cols of matrix");
		int cols = s.nextInt();
		int mat[][] = new int[rows][cols];
		System.out.println("Enter the value for the "+rows+" by "+cols+" matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				mat[i][j] = s.nextInt();
			}
		}
		int mat2[][] = new int[rows][cols];
		int add[][] = new int[rows][cols];
		System.out.println("Enter the value for second matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				mat2[i][j] = s.nextInt();
			}
		}
		for(int i=0;i < rows;i++){
			for(int j=0;j<cols;j++){
				add[i][j] = mat[i][j] + mat2[i][j]; 
			}
		}
		System.out.println("Addition Of Matrix : ");
		for(int i = 0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}
}