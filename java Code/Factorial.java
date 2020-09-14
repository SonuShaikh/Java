// Find factorial of two numbers
import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of that you want a factorial");
		int num = s.nextInt();
		int factorial = 1;
		for(int i=1;i<=num;i++){
			if( num != 0){
				factorial *= i;
			}
		}
		System.out.println("Factorial of "+num+" is : "+factorial);
	}
}