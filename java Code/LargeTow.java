// Find Largest Amoung Two Number
import java.util.*;
class LargeTow{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any number: ");
		int n1 = s.nextInt();
		System.out.println("Enter Second Numbers");
		int n2 = s.nextInt();
		if(n1>n2){
			System.out.println(n1+" is greater number Than "+n2);
		}else{
			System.out.println(n2+" is greater number Than "+n1);
		}
	}
}