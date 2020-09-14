// Division of numbers;
import java.util.*;
class Division{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number bitween 1 - 10");
		int counter = 0;
		int num = s.nextInt();
		for(int i = 1;i<=100;i++){
			if(num == 0){
				System.out.println("Illegal Entry;");
			}else if( num != 0){
				if(i % num == 0){
					counter += 1;
					//System.out.println(i+" is divisible by "+num);
				}
			}
		}
		System.out.println(counter+" numbers are divisible by "+num+" between 1 to 100");
	}
}