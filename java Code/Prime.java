// prime or not
import java.util.*;
class Prime{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check weather it is prime or not");
		int num = s.nextInt();
		int i,flag = 0;
		for(i=2;i<num;i++){
			if(num % i == 0){
				flag = flag + 1;
                                System.out.println(flag);
				break;
			}
			i++;
		}
		if(flag == 0){
			//System.out.println(num+" is prime number");
		}else{
			//System.out.println(num+" is not prime number");
		}
	}
}