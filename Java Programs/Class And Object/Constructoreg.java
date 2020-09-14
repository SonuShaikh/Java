// Area of the tringle
class TringleConstructor
{
	double Side;
	double Area;
	TringleConstructor(double s)
	{
		Side = s;
		Area  = Side*Side*Side;
		System.out.println("The Area of the Triangle is : "+Area);
	}
}
class Constructoreg
{
	public static void main(String args[])
	{
		TringleConstructor obj =new TringleConstructor(10);
	}
}