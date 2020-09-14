// create class Emp having the member name and salary. Accept and display the data for one objects use nested methode
import java.io.*;
class Emp
{
	
	String Name;
	int Basic_Salary;
	void getdata(String na, int Basic)
	{
	
		Name=na;
		Basic_Salary=Basic;
		display();
		Camparision();
	}
	void display()
	{
		
		System.out.println("Name of the Employee : "+Name);
		System.out.println("Basic Salary of the Employee : "+Basic_Salary);
	}
	void Camparision()
	{
		if(Basic_Salary>50000)
		{
			System.out.println("You Earn Lots Money......!!!!");
		}
		if(Basic_Salary>30000)
		{
			System.out.println("You Earn Average Money  ");
		}
		if(Basic_Salary<30000)
		{
			System.out.println("You Basic Salary is Too Low Need to More workss");
		}
	}
}
class UseEmp
{
	public static void main(String arg[])
	{
		
		try{
			 Emp obj=new Emp();
			 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
			 System.out.println("Enter the Name of the Employee");
			 String name=br.readLine();
			 System.out.println("ENter the Basic Salary of the Employee");
			 int Salary=Integer.parseInt(br.readLine());
			 //float Salary=Float.valueOf(br.readLine().floatvalue());
			obj.getdata(name,Salary);
		}catch(Exception e){}
		
	}
}