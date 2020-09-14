// Fibonacci Series
import java.util.*;
class Fab{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num, t1 = 1,t2=1,t,i;
		System.out.println("Enter the nth term of fabonacci series");
		num = s.nextInt();
		for(i = 1; i<=num; i++){
			t = t1 + t2;
			System.out.print(t+" ");
			t1 = t2;
			t2 = t;
		}
		
	}
}