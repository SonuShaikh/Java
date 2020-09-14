// Write a program to input Employee name, desigination, and basic salary, make use of the try and Catch
import java.util.*;
class Employee
{
	public static void main(String args[])
	{
		Scanner Scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter the name of the Employee : ");
			String Name=Scan.nextLine();
			System.out.println("Enter the desigination of the Employee");
			String desig=Scan.nextLine();
			System.out.println("Enter the BAsic salary fo the Employee");
			double sal=Scan.nextDouble();
			
			System.out.println("Name :"+Name);
			System.out.println("Desigination"+desig);
			System.out.println("Basic Salary "+sal);
			
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}