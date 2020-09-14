// write programm to find area of the circle Make sure use of the this
import java.util.*;
class Circlethis
{
	double r;
	void getData(double r)
	{
		this.r=r;
	}
	void calculate()
	{
		double Area = Math.PI*r*r;
		System.out.println("The Area of the circle : "+Area);
	}
}

class CircleThis
{
	public static void main(String args[])
	{
		Circlethis obj= new Circlethis();
		obj.getData(10.00);
		obj.calculate();
	}
}