// Recursion Method
class factorial
{
	int result;
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
			result = fact(n-1)*n;
		return result;
			
	}
}
class Recursion
{
	public static void main(String args[])
	{
		factorial obj = new factorial();
		System.out.println("The factorial of the 3 : "+obj.fact(3));
		System.out.println("The factorial of the 10 : "+obj.fact(10));
		System.out.println("The factorial of the 6 : "+obj.fact(6));
	}
}