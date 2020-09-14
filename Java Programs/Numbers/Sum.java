//write program to take input form user and display the sum of the two numbers
import java.io.*;
class Sum
{
	public static void main(String arg[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
		
			System.out.println("Enter the Fist Number");
			int num1=Integer.parseInt(br.readLine());
			System.out.println("Enter the Second Number");
			int num2=Integer.parseInt(br.readLine());
			
		    System.out.println("The Sumation of the "+num1+ " And "+num2+ " Is Equal to "+(num1+num2));
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
		
	}
}