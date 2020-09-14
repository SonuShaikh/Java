// write a program to find the sum and average of the Three members use the static members and methodes and 
class StaticMembersAndMethods
{
    static int x;
    static int y;
    static int z;
	static int members=0;
	static int sum;
	static double Average;
	public static void getData(int a, int b, int c)
	{
		x=a;
		y=b;
		z=c;
	  	 
	}
	public static void sum()
	{
		
		 sum = x+y+z;
		System.out.println("Sum : "+sum);
	}
	public static void avg()
	{
		 Average = sum/3;
		System.out.println("Average  : "+Average);
	}
	public static void main(String args[])
	{
		getData(10,20,30);
		sum();
		avg();
	}
}