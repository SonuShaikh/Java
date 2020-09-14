// Write a program to find the Area of the circle and triangle. Make use of the Method Overloading
class AREA
{
	double Radius;
	int Side;
	double Areas;
	void getData(double R)
	{
		Radius = R;
	}
	void getData(int s)
	{
		Side=s;
	}
	void AreaCicle()
	{
		System.out.println("The Area of the cirlce is : "+(Math.PI*Radius*Radius));
		
	}
	void AreaTriangle()
	{
		System.out.println("The Area of the Triangle is : "+(Side+Side+Side));
	}
}
class AREAEG
{
	public static void main(String args[])
	{
		AREA obj = new AREA();
		obj.getData(10.00);
		obj.AreaCicle();
		AREA obj1 = new AREA();
		obj1.getData(10);
		obj1.AreaTriangle();
	}
}