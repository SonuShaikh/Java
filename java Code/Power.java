// Find power of a number
import java.util.*;
class Power{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base number");
		int base = s.nextInt();
		System.out.println("Enter the power number");
		int power = s.nextInt();
		int result = base;
		for(int i=1;i<power;i++){
			result *= base;
		}
		System.out.println(power+"th power of "+base+" = "+result);
	}
}