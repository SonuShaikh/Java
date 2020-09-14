import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;
public class Cat{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// x cat A, y Cat B, z Mouse C
		int q = scan.nextInt();
		int A = 0,B = 0,C = 0;
		for(int i = 0; i < q; i++){
			 A = scan.nextInt();
			 B = scan.nextInt();
			 C = scan.nextInt();
			 
			 int ac = Math.abs(C - A);
	 int bc = Math.abs(C - B);
	 if(ac < bc){
		 System.out.println("Mouse Etten By The Cat A");
	 }else if(ac == bc){
		 System.out.println("Both CAT busy in fighting and mouse has escaped.");
	 }else{
		 System.out.println("Mouse Etten By The Cat B");
	 }
	 
	}
		}
		
		/* for(int i =0; i<q; i++){
			System.out.println(A+" "+B+" "+C);
			//System.out.printf("%d \t %d\t %d",A,B,C);
		} */
}

//http://www.jedhecollege.ac.in fyb.computerscience(fybcs)