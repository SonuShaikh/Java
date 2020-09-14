// write program to find largest no out of three numbers using Nested if.. esle. Take input from User
import java.io.*;
class Larg3
{
	public static void main(String agr[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the First Number");
			int a= Integer.parseInt(br.readLine());
			System.out.println("Enter the Second Number");
			int b= Integer.parseInt(br.readLine());
			System.out.println("Enter the First Number");
			int c= Integer.parseInt(br.readLine());
			int larg= a;
			if(b>larg)
				larg=b;
			if(c>larg)
				larg=c;
			
			System.out.println("The Largest Number Among the Three numbers is : "+larg);
				
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}