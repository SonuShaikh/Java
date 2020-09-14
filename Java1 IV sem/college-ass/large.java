// write program to find largest number out of two number accept number from user
import java.io.*;
class large
{
	public static void main(String args[])
	{
	  int num1,num2,sum;
	  try{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter two values");
		num1=Integer.parseInt(br.readLine());
		num2=Integer.parseInt(br.readLine());
		if(num1>num2)
		{
			System.out.println(+num1+" Is the largest number");
		}
		else
		{
			System.out.println(+num2+" Is the largest number");
		 }
	    }catch(Exception e){}
    }
}
/* Enter two values
52
25
52Is the largest number */