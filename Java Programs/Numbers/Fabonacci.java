//Write program to find Fabonacci Series
import java.io.*;
import java.util.*;
class Fabonacci
{
	public static void main(String arg[])
	{
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   int a=0, b=1,c,i=0;
	   try
	   {
		System.out.println("Enter the Limit of Fabo Series");
        int l= Integer.parseInt(br.readLine());
		while(i<l)
		{
			c=a+b;
			System.out.print(c + "\t");
			a=b;
			b=c;
			i++;
		}
		
	   }catch(Exception e)
	   {
		   System.out.println("Exception Caught : "+e);
	   }
	}
}