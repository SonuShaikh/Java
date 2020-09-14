class area
{
	
	
		int lentgh;
		int breadth;
		void getdata()
		{
			lentgh=20;
			breadth=10;
		}
		void calculate()
		{
			int a;
			a=lentgh*breadth;
			System.out.println("Area of Tringle ="+a);
		}
	
}
class AreaRect
{
	public static void main(String sonu[])
	{
		area r=new area();
		r.getdata();
		r.calculate();
	}
}