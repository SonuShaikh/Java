// Write program to perform addition of two numbers ussing single inheritance.
class Add1
{
	double num1;
	double num2;
	
	void getData(double a, double b)
	{
		num1=a;
		num2=b;
	}
	void display()
	{
		System.out.println("First Number is : "+num1);
		System.out.println("Second Number is : "+num2);
	}
	
}
class Add2 extends Add1
{
	void calculate()
	{
		double sum = num1+num2;
		System.out.println("The Sumation of the numbers Is : "+sum);
	}
}

class SingleInheristence
{
	public static void main(String args[])
	{
		Add2 obj= new Add2();
		obj.getData(12,22);
		obj.display();
		obj.calculate();
	}
}