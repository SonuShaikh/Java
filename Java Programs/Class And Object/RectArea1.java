// Nesting Methodes
// write program to find out the Area of the Rectangle take input from the user and Use nested Methodes
import java.io.*;
class Rectangle1
{
	private double len;
	private double bred;
	private double Area;
	
	void getNum(double a, double b)
	{
		len=a;
		bred=b;
		disNum();
	}
	
       void disNum()
	{
		System.out.println("Length : "+ len);
		System.out.println("Breadth  : "+bred);
		calArea();
	}
	void calArea()
	{
		Area = len*bred;
		System.out.println("The Area of The : "+Area);
	}
}

class RectArea
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			Rectangle1 obj=new Rectangle1();
			System.out.println("Enter the Length of RectAngle : ");
			double l= Double.parseDouble(br.readLine());
			System.out.println("Enter the Breadth fo the Rectangle : ");
			double b= Double.parseDouble(br.readLine());
			obj.getNum(l,b);
			
		}catch(Exception e)
		{
			System.out.println("Exception Caugth : "+e);
		}
	}
}