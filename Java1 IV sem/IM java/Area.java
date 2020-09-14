interface maths
{
	 void Area(int r);
	double pi=3.14;
}
class circle implements maths
{
	public void Area(int r){
	System.out.println("The Area of the Circle is the :" +(pi*r*r));}
}
class sphear implements maths
{
	public void Area(int r)
	{
	System.out.println("The Area of the Sphere is the :" +(4*pi*r*r));
	}
}
 class main
 {
	 public static void main(String arg[])
	 {
		 circle obj=new circle();
		 sphear obj1=new sphear();
		 obj.Area(5);
		 obj1.Area(5);
	 }
 }