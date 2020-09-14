//Volume of Box
import java.util.*;
class BoxVolume{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of box");
		double len = s.nextDouble();
		System.out.println("Enter the width of box");
		double wid = s.nextDouble();
		System.out.println("Enter the height of box");
		double hei = s.nextDouble();
		double volume = len*hei*wid;
		System.out.println("THe value of the Box "+volume);
	}
} 