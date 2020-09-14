// write program to find Area of the Reactangle  using classees and objects
class Rectangle
{
	private double length;
	private double breadth;
	
	void getNumbers(double a, double b)
	{
		length=a;
		breadth=b;
	}
	void display()
	{
		System.out.println("Length  : "+length);
		System.out.println("Breadth  : "+breadth);
	}
	void calculate()
	{
		double Area = length * breadth;
		System.out.println("The Area of the Trangle is : "+Area);
	}
}
class RactArea
{
	public static void main(String args[])
	{
		Rectangle obj= new Rectangle();
		obj.getNumbers(10.55,30.55);
		obj.display();
		obj.calculate();
	}
}