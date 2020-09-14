//write program to compute the sum of  square of first 10 integers number using the  while loop
class Sqrt
{
	public static void main(String arg[])
	{
		int square,sum=0;
		for(int i=1; i<10;i++)
		{
			square=i*i;
			System.out.println("The Square of "+i+ " is : "+square);
			sum=sum+square;
		}
		System.out.println("The Sum of the Squre of first 10 Int number are : "+sum);
	}
}