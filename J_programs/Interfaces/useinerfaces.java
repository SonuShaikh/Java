// prograam to find area of all shapes 
interface maths{
	void area(int r);
	double pi=3.14;
	int side=5;
	int length= 10;
	int breath=15;
}
class circle implements maths
{
	void area(int r)
	{
		double AreaOfCircle = pi*r*r;
		System.out.println("Area of the Circle:"+AreaOfCircle);
	}
}
class spheare implements maths
{
	void area(int r)
	{
		double AreaOfSphere= 4*pi*r*r;
		System.out.println("Area od the Sphere is:"+AreaOfSphere);
	}
}
class Tringle implements maths
{
	 void Area()
	{
		int AreaOfTringle=side*side*side;
		System.out.println("Area of the Tringle is:"+AreaOfTringle);
	}
}
class Rect implements maths 
{
   void Area(){
	   Arearect=length*breath;
	System.out.println("The Area of the Rectangle: "+Arearect);
   }
}
class useinterfaces
{
	public static void main(String arg[])
	{
		circle obj=new circle();
		spheare obj1=new spheare();
		Tringle obj2=new Tringle();
		Rect obj3=new Rect();
		obj.area(5);
		obj1.area(10);
		obj2.Area();
		obj3.Area();
		
	}
}
