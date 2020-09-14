// Write program to create class  as Employee having data memer as Name Basic Salary.
import java.util.*;
class Employee
{
	String Name;
	double Bsalary;
	
	void getData(String N, double Bs )
	{
		Name = N;
		Bsalary = Bs;
	}
	void Show()
	{
		System.out.println("The Name of the Employee  : "+Name);
		System.out.println("The Basic Salary of the Employee  : "+Bsalary);
		
	}
}
class Employeeeg
{
	public static void main(String args[])
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Nmae of the Employee");
		String name =Scan.nextLine();
		System.out.println("Enter the Bacis Salary of the Employee");
		double salary = Scan.nextDouble();
		Employee obj= new Employee();
		obj.getData(name,salary);
		obj.Show();
		
	}
}