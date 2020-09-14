//WAP to accept two no and find the root of first and square root of 2nd 
//display the results along with the minimum and maximum and the result.
import java.util.*;
import java.io.*;
class MathClass {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number For Cube Root");
		double root = Double.parseDouble(br.readLine());
		double r1 = Math.cbrt(root);
		System.out.println("Cube Root"+r1);
		
		System.out.println("Enter The Number For Squere Root");
		double sq = Double.parseDouble(br.readLine());
		double r2 = Math.sqrt(sq);
		System.out.println("Squer Root"+r2);
		System.out.println("Maximu Result "+Math.max(r1,r2));
	}
}
/*
   Output:
C:\Users\sonu\Desktop\Java>java MathClass
Enter The Number For Cube Root
27
Cube Root3.0
Enter The Number For Squere Root
4
Squer Root2.0
Maximu Result 3.0
*/