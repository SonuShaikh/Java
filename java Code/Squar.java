// Find the Square of n NUmbers
import java.util.*;
class Squar{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Any number");
		int num = s.nextInt();
		System.out.println("\n");
		for(int i=1;i<=num;i++){
			System.out.println(i+"'s Square is  "+i*i);
		}
	}
}