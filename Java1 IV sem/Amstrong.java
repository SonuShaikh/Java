// java program to the print the amstrong number
import java.io.*;
class Amstrong
{
	public static void main(String sonu[])
	{
		int n;
		int check=0;
		int remainder;
		try
		{
			BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter the the value for N");
			n= Integer.parseInt(br.readLine());
			
			while(n>0)
			{ 
			  remainder = n % 10; 
         check = check + (int)Math.pow(remainder,3); 
         n = n / 10; 
			}
			if(check==n)
			{
				System.out.println("THe number is the Amstrong");
			}
			else
			{
				System.out.println("The number is not Amstrong number");
			}
		}catch(Exception e){}
	}
}