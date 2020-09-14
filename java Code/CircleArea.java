//white a program to find out the area and circumference of circle
import java.io.*;
import java.util.*;
class CircleArea{
	public static void main(String[] agrs){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter the Radius of circle");
			double radius = Double.parseDouble(br.readLine());
			double Area = Math.PI*radius*radius;
			double circumference = 2 * Math.PI * radius;
			System.out.println("Area of circle : "+Area);
			System.out.println("Circumeference of Cicle: "+circumference);
		}catch(Exception e){
			System.out.println("Exception Cought "+e);
		}
	}
}