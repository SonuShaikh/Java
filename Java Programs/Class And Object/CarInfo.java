// write a program to display about the car models containing car anem and proce. use command line to input value form number of cars m make use of classes and objects
import java.util.*;
class Car
{
	double price;
	String CarName;
	
	void getData()
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Eneter the Name of The cars : ");
		CarName= Scan.nextLine();
		System.out.println("Enter the Price Of the car : ");
		price=Scan.nextDouble();
		
	}
	void display()
	{
		System.out.println("The Name Of the Car Model : "+CarName);
		System.out.println("The Price Of the Car  : "+price);
	}
}
class CarInfo
{
	public static void main(String args[])
	{
		Car Mod[]=new Car[3];
		int i;
		for(i=0; i<Mod.length; i++)
		{
			Mod[i]=new Car();
			Mod[i].getData();
		}
		for(i=0; i<Mod.length; i++)
		{
			Mod[i].display();
		}
	}
}