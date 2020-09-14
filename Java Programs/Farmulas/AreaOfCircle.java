// Write program to take value of radius from command line and find diameter, circumference and area of circle
// formulas : diameter=2*radius; circumference= 2*diameter*radius; Area=diameter*radius*radius
import java.io.*;
class AreaOfCircle
{
	public static void main(String args[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			
		
		{
			System.out.println("Enter The Radius of The Circle : ");
			double radius=Double.parseDouble(br.readLine());
			System.out.println("The Radius of the Circle is : "+radius);
			double dia= 2*radius;
			System.out.println("The Diameter of the Cirlce is : "+dia);
			System.out.println("The Circumference of The Circle is : "+(2*dia*radius));
			System.out.println("The Area of The Circle is : "+(dia*radius*radius));
		}
		}catch(Exception e){}
	}
}