// Write program to swap two number withought using third varialble
import java.io.*;
class SwapNo
{
	public static void main(String args[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the First Integer Number : ");
			int num1=Integer.parseInt(br.readLine());
			System.out.println("Enter the Second Integer Number : ");
		    int num2=Integer.parseInt(br.readLine());
			System.out.println("Before Swaping The Numbers Are :");
			System.out.println(" Num1 : "+num1+ " Num2 : "+num2);
			
			int temp =num1;
			num1=num2;
			num2=temp;
			
			System.out.println("After Swaping The Numbers Are :");
			System.out.println(" Num1 : "+num1+ " Num2 : "+num2);
			
			
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}