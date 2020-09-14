// Defind the class factorial with instance variable n and find factorial of n using class and object
import java.io.*;
class Factorial
{
	int n;
	int fact=1;
	void getNum(int a)
	{
		n=a;
	}	
	
	void getFact()
	{
		
		for(int i=1; i<=n; i++)
		{
		     fact = fact*i;	
			
		}
		System.out.println("Factorial of "+n+ " is "+fact);
	}
}
class Factorialeg
{
	public static void main(String args[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter the number of That you want to find out the factorial : ");
			int f=Integer.parseInt(br.readLine());
		Factorial obj = new Factorial();
		obj.getNum(f);
		obj.getFact();
			
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
		
	}
}