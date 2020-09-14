// writer program to print the sum of the harmonic Series
import java.util.*;
class Harmonic
{
	public static void main(String arg[])
	{
		Scanner Scan= new Scanner(System.in);
		try
		{
			int i,num;
			double sum=0.0;
			System.out.println("Enter the Length of the numbers : ");
			num=Scan.nextInt();
			for(i=1;i<=num; i++)
			{
				System.out.print(" 1 / "+i+ " + ");
				sum=sum+(double) 1/i;
			}
			System.out.println("\n The sumation of Harmonic Serie is : "+sum);
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}