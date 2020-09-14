// Create class Student having instance variable RollNo and methode getNo() and putNo(). 
// Create class Test derived from Student haiving variable as sub1 sub2 and methode getMarks() and putMarks().
// Defind the Interface Sport having constant Sportwt and method putwt.
// Derive a class Result from Test which implements this interface and calculate total by adding marks in two subjects
// and sport's Marks. Display the result

import java.util.Scanner;

interface Sport
{
	int sportwt=90;
	/* public void putwt(); */
}

class Student implements Sport
{
	int RollNo;
	Scanner Scan = new Scanner(System.in);
	void getNo()
	{
		
		System.out.println("Enter the Roll No Please : ");
		RollNo = Scan.nextInt();
	}
	void putNo()
	{
		System.out.println("Roll No : "+RollNo);
	}
	
	/* void putwt()
	{
		System.out.println("Marks in the Sport subject : "+sportwt);
	} */
}
class Test extends Student
{
	int sub1, sub2;
	void getMarks()
	{
		System.out.println("Enter the Mark In First Subject Please : ");
		sub1=Scan.nextInt();
		System.out.println("Enter the Marks In the Second Subject please : ");
		sub2=Scan.nextInt();
	}	
	void putMarks()
	{
		System.out.println("Marks In First Sub : "+sub1);
		System.out.println("Marks In Second Sub : "+sub2);
	}
}

class Result extends Test 
{
	double total;
	/* void putwt()
	{
		System.out.println("ENter hte Marks in the Sport Subjects : ");
		sportwt= Scan.nextInt();
	} */
	void calculate()
	{
		total = sub1+sub2+sportwt;
		System.out.println("Total = "+total);
	}
}
class Studenteg
{
	public static void main(String args[])
	{
		Result obj = new Result();
		obj.getNo();
		obj.getMarks();
		obj.putNo();
		obj.putMarks();
		/* obj.putwt(); */
		obj.calculate();
	}
}