// writep a program to calculate area of tringle and circle using interface. crete two separate clasees for tringle and circle
import java.util.*;
interface Area
{
	
	double radius = 5.0;
	double side= 10.56;
	void AreaCalculate();
}
class Circle implements Area
{  
     double area;
	public void AreaCalculate()
	{
		area = Math.PI*radius*radius;
		System.out.println("The Area of the Circle is : "+area);
	}
}
class Tringle implements Area
{
	
	double area;
	public void AreaCalculate()
	{
		area = radius*radius*radius;
		System.out.println("The Area of the TRiangle is "+area);
	}
}
class AreaInt
{
	public static void main(String args[])
	{
		Circle obj= new Circle();
		obj.AreaCalculate();
		Tringle obj1 = new Tringle();
		obj.AreaCalculate();
	}
}