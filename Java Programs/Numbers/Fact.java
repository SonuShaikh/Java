// write program to print the factorial of the given Number
import java.io.*;
class Fact
{
	public static void main(String arg[])
	{
		int f=1;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter the number of That You Want Factorials");
			int n=Integer.parseInt(br.readLine());
			for(int i=1;i<=n;i++)
			{
				f=f*i;
			}
			System.out.println("The factorila of "+n+ " is : "+f);
	
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}