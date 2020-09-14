// Demonstrate teh type Wrapp
class wrap
{
	public static void main(String args[])
	{
		Integer iOb = new Integer(100);
		int i = iOb.intValue();
		System.out.println("The value of teh I :"+i);
		Double dOb = new Double(100.88);
		double d = dOb.doubleValue();
		System.out.println(d);
	}
}