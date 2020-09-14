// write program to Area of circle and Tringle Make sure use of the Methode overloading
class numbers
{
	int radius=10;
	double area;
	double pi=3.14;
	int side=50;
	
}
class Circle extends numbers
{
     
	 void a()
	 {
		 System.out.println("The Radius of the Circle : "+radius );
		 area= pi*radius*radius;
		 System.out.println("The Area of the Circle is : "+area);
	 }
}
class Tringle extends Circle
{
	void a()
	{
		area=side+side+side;
		System.out.println("The Area of the Tringle : "+area);
	}
}
class Area{
	public static void main(String arg[])
	{
		Tringle obj=new Tringle();
		obj.a();
	}
}