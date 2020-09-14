//  example
import java.io.*;
class Squaresum
{
	public static void main(String sonu[])
         {
	 int a[]=new int[10];
	 int i, sum=0, square;
	try
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Value for 10 numbers");
		for(i=1; i<=9; i++)
		a[i]= Integer.parseInt(br.readLine());
	    
		System.out.println("Enterd numbers are as follows");
		  for(i=1; i<10; i++)
		  {
			  System.out.println(a[i]);
		  }
		  System.out.println("the square of numbers");
		  for(i=1; i<=9; i++)
		  {
			  square= a[i]*a[i];
			 
			  System.out.println("Square of "+ a[i]+" = " +square  );
			  sum=sum+square;
		  }
		  
		System.out.println("Sum of Square =" +sum);
	} catch(Exception e){}
}
}