import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Diagonal{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] ar = new int[n][n];
		int LeftD = 0;
		int RightD = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				ar[i][j] = in.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				    
				if(i == j ){
					LeftD = LeftD + ar[i][j];
                       //System.out.print(ar[i][j]+" ");  
				}
				if(i + j ==(n -1) ){
					System.out.print(ar[i][j]+" ");
					RightD = RightD + ar[i][j];
				}
				
			}			
		}
		//System.out.println(LeftD+"  "+RightD);
		System.out.println(Math.abs(LeftD - RightD));
	}
}

