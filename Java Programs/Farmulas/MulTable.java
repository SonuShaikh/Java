//  write program to print the multiplication table between range
import java.util.*;
class MulTable
{
	public static void main(String args[])
	{
		int start, end;
		Scanner Scan = new Scanner(System.in);
		try
		{
			System.out.println(" Enter The Number From Where Table Star : ");
			start = Scan.nextInt();
			System.out.println(" Enter The Number From Where Table End : ");
			end= Scan.nextInt();
			for(int i=start; i<=end;i++)
			{
				System.out.println("The Multiplication table OF "+i);
				for(int j=1; j<=10; j++)
				{
					System.out.println(i*j);
				}
			}
		}catch(Exception e)
		{
			System.out.println(" Exception Caught : "+e);
		}
	}
}