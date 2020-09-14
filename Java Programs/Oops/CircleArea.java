// write a program to calculate the area of the circle by usiing the constructor
import java.util.*;
class Circle 
{
	double r;
	double Area;
	Circle(double rad)
	{
		r=rad;
	}
	void calculate()
	{
		Area=Math.PI*r*r;
		System.out.println("The Area of The Circle is : "+Area);
	}
}
class CircleArea
{
	public static void main(String args[])
	{
		Circle obj= new Circle(10);
		obj.calculate();
	}
}