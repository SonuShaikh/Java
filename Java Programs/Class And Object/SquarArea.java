// Write program to find area and perimite of the Square
// Formula : Area = s*s; Perimeter : 2*s; s= side of square;
import java.io.*;
class Square
{
	double side;
	void getData(double s)
	{
		side= s;
	}
	void perimiters()
	{
		double perimeter = 2*side;
		System.out.println("Area of the Perimeter is : "+perimeter);
	}
	void area()
	{
		double area = side*side;
		System.out.println("The Area of the Square is : "+area);
	}
}
class SquarArea
{
	public static void main(String arg[])
	{
		Square obj= new Square ();
		obj.getData(10);
		obj.perimiters();
		obj.area();
	}
}