// sample program to recursion
class Factorial
{
	int fact(int n)
	{
		int result;
		if(n==1)
			return 1;
		else
			return result=fact(n-1)*n;
	}
}
class Recursion
{
public static void main(String args[])
{
   Factorial f = new Factorial();
   System.out.println("Factorial of 3 is "+f.fact(3));
   System.out.println("Factorial of 6 is "+f.fact(5));
   System.out.println("Factorial of 9 is "+f.fact(9));
   
}
}