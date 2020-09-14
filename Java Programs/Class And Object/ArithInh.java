// Write a program to create a class storing two numbers. Using Hierarchiy to perform addion, subtractio and multiplication
import java.util.Scanner;
class Numbers
{
	double num1,num2,add,sub,mul;
     void getData()
	 {
		 Scanner Scan = new Scanner(System.in);
		 System.out.println("Enter Teh first Number : ");
		 num1=Scan.nextDouble();
		 System.out.println("Enter the Second Number : ");
		 num2 = Scan.nextDouble();
	 }	 
}
class Addition extends Numbers
{
	void addM()
	{
		add=num1+num2;
		System.out.println("Sum : "+add);
	}
	
}
class Subtraction extends Numbers
{
	void subM()
	{
		sub=num1-num2;
		System.out.println("Sub : "+sub);
	}
}
class Multiplication extends Numbers
{
	void mulM()
	{
		mul = num1*num2;
		System.out.println("Mul : "+mul);
	}
}
class ArithInh
{
	public static void main(String args[])
	{
		Addition obj = new Addition();
		obj.getData();
		obj.addM();
		Subtraction obj1 = new Subtraction();
	
		obj1.subM();
		Multiplication obj2 = new Multiplication();
		
		obj2.mulM();
	}
}