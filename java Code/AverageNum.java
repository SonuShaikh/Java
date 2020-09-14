// Find Average of n number
import java.io.*;
import java.util.*;
class AverageNum{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the How many number you want.");
		int num =s.nextInt();
		System.out.println("Enter Any " +num+" numbers.");
		int nums[] = new int[num];
		int sum = 0;
		for(int i=0; i<num;i++){
			nums[i] = s.nextInt();
			sum = sum + nums[i];
		}
		System.out.println("Average of "+num+" numbers is "+(sum/num));
	}
}