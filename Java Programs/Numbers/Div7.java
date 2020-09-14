// write a program to check weather the number is devisible by 7 not using the do while;
import java.io.*;
class Div7
{
	public static void main(String arg[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter The Any Integer Number");
			int num = Integer.parseInt(br.readLine());
			if(num % 7 ==0)
			{
				System.out.println("The numbers is Divisible by 7");
			}
			else 
			{
				System.out.println("The Number is not Divisible by 7");
			}
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}