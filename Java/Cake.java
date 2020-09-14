import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;
class Solution {
	
	 static int count = 0;
	
	 static int birthdayCandle(int n,int[] ar){
		int large = ar[0];
        
		for(int i_ar = 1; i_ar < n; i_ar++){
			  
			 if (large < ar[i_ar])
				 large = ar[i_ar];				 
		}
		
		for(int i_ar = 0; i_ar < n; i_ar++){
			if(large == ar[i_ar])
				count++;
		}
		if (count == 0)
		   count = 1;
	   
	   
		return count;
	} 
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
	        System.out.println("What is your age ??");
		int n = scan.nextInt();
		int[] ar = new int[n];
	   
		System.out.println("Enter  Heights for "+n+" Candle ");
		for(int i_ar = 0; i_ar < n; i_ar++){
			ar[i_ar] = scan.nextInt();
		}
		
		 int result = birthdayCandle(n,ar);
		System.out.println(" YOu Can Blow OUt Only "+result+" CAndles"); 
	}
} 