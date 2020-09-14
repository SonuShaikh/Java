// write a program to find perform arithmetic operation on 2 onstant volue. Make use of the Abstract class
abstract class absclass
{
	double num1, num2;
	double addition,sub,mul,div;
	void getData(double a, double b)
	{
		num1=a;
		num2=b;
		display();
	}
	abstract void calculate();
	void display()
	{
		System.out.println("First Number : "+num1);
		System.out.println("Second Number : "+num2);
	}
} 
class calculation extends absclass
{
	
	void calculate()
	{
		addition = num1+num2;
		sub = num1-num2;
		mul= num1*num2;
		div = num1/num2;
		
	}
	void ShowResult()
	{
		System.out.println("The Addition of Numbers : "+addition);
		System.out.println("The subtraction of Number : "+sub);
		System.out.println("The Multiplication of Number : "+mul);
		System.out.println("The Division of Number : "+div);
	}
}
class ArithmeticOperation
{
	public static void main(String args[])
	{
		calculation obj= new calculation();
		obj.getData(10,20);
		obj.calculate();
		obj.ShowResult();
	}
}
	