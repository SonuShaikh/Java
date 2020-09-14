//calculat speed of moving object
import java.util.*;
class Speed{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Distance Covered By car:");
		double dis = s.nextDouble();
		System.out.println("Enter the Time in minutes");
		int time = s.nextInt();
		double sp = dis/(time * 60)*18/5;
		System.out.println("The Speed of car is :"+sp+" kilometer per hour.");
	}
}