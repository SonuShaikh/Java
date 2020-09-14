import java.util.*;
class Arm{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Enteger Number");
		int i = s.nextInt();
		int a,b,c;
		a = i % 10;
		b = i % 100;
		b = (b-a)/10;
		c = i / 100;
		
		if((a*a*a)+(b*b*b)+(c*c*c) == i){
			System.out.println("Armstrong Number");
		}else{
			System.out.println("Not Armstrong Number");
		}
	}
}