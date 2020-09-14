// Write a program to find out the sum of the Using the single inheristence
import java.util.*;
class Sum1
{
	int a;
	int b;
	int c; 
	int sum;
	void getData()
	{
		 Scanner Scan = new Scanner(System.in);
		 System.out.println("Enter the Fist Number");
		 a= Scan.nextInt();
		 System.out.println("Enter the Second Number");
		 b=Scan.nextInt();
		 System.out.println("Enter the Third Number");
		 c=Scan.nextInt();
		 
	}
	
}
class sum2 extends Sum1
{

	void calculate()
	{
	  int sum  = a+b+c;
	  System.out.println("The Sumation of the  number is : "+sum);
	}
}
class Sumeg
{
	public static void main(String args[])
	{
		sum2 obj= new sum2();
		obj.getData();
		obj.calculate();
	}
}