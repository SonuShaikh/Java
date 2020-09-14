//Circumference and Volume of Sphere
import java.io.*;
import java.util.*;
class Sphere{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of Sphere ");
		double Radius = s.nextDouble();
		System.out.println("Circumference :"+(4*Math.PI*Radius*Radius));
		System.out.println("Area :"+(4/3*Math.PI*Radius*Radius*Radius));
	}
}