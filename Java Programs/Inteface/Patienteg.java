// Write a program to create a class patient o store name , age . Anathore class details containing his hieght and width
// Inherit features of both these classes to create a class called Display and show  complete information
import java.util.*;
class Patient
{
	String Name; 
	int age;
	Scanner Scan = new Scanner(System.in);
	void getInfo()
	{
		System.out.println("Please Enter The Name ");
		Name = Scan.nextLine();
		System.out.println("Please Enter the Age : ");
		age= Scan.nextInt();
	}
	
}
class Details
{
	double height;
	double width;
	Scanner Scan = new Scanner(System.in);
	void getDetails()
	{
		
		System.out.println("Please Enter The Hieght ");
		height = Scan.nextDouble();
		System.out.println("Please Enter the Width : ");
		width= Scan.nextDouble();
	}
	
}
class Display implements Patient , Details
{
	void show()
	{
		System.out.println("Name of The Patient: "+Name);
		System.out.println("Age of The Patient : "+age);
		System.out.println("Name of The Hieght: "+height);
		System.out.println("Age of The Width : "+width);
	}
}
class Patienteg
{
	public static void main(String args[])
	{
		Display obj = new Display();
		obj.getInfo();
		obj.getDetails();
		obj.show();
	}
}