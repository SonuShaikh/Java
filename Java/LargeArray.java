import java.util.*;
class LargeArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number ");
		
		int n = scan.nextInt();
		int[] ar = new int[n];
	    
		
		System.out.println("Enter "+n+" Numbers");
		for(int i_ar = 0; i_ar < n; i_ar++){
			ar[i_ar] = scan.nextInt();
		}
		int large = ar[0];
        
		for(int i_ar = 1; i_ar < n; i_ar++){
			   
			 if(large < ar[i_ar])
				 large = ar[i_ar];
		}
		 
		System.out.println("\n\n\n"+large);
		
		
		
	}
}