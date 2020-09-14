import java.util.*;
class StaticInitializerBlock{
	public static void getValue(int H,int B){
		if( H <= 0 || B <= 0)
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		else
			System.out.println(H * B);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		getValue(n1,n2);
	}
} 