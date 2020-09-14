// Demonstrate currentTimeMillis() and NanoSecon;
class Elapsed
{
	public static void main(String args[])
	{
		long start, end;
		
		System.out.println("Time For A Loop 0 to 1,000,000");
		start = System.currentTimeMillis();
		System.out.println("Start  : "+start);
		for(int i = 0; i< 1000000; i++);
			end = System.currentTimeMillis();
			System.out.println("End : "+end);
		System.out.println("Elapsed Time : "+(end  - start));
	}
}