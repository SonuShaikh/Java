// Write program to Find smallest no out of 2 numbers use command line to Input numbers
import java.io.*;
class SmallestNO2
{
	public static void main(String arg[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter The Fist Numbers : ");
			int num1=Integer.parseInt(br.readLine());
			System.out.println("Enter The Second Numbers : ");
			int num2= Integer.parseInt(br.readLine());
			if(num1>num2)
				System.out.println("The Number "+num1+" Is Greater Than"+ num2);
			else
				System.out.println("The number "+num2+" Is Grater Than" +num1);
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}