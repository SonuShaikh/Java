// Write a program to prient the fabonacie series of number, Make sure use of the Consturctor
import java.util.*;
class Fabonacci
{
	int a,b,c,num,i=0;
	Fabonacci( int n)
	{
	      a=0;
          b=1;
          num=n;		  
	}
	void fab()
	{
		while(i<=num)
		{
			c= a+b;
			a=b;
			b=c;
			i++;
			System.out.print(c+ "\t");
		}
		
	}
}
class Fabonaccieg
{
	public static void main(String args[])
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of the you want to print the Fabonacie series");
		int f= Scan.nextInt();
		Fabonacci obj = new Fabonacci(f); 
		obj.fab();
		
	}
}