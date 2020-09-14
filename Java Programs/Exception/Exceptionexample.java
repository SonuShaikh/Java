// Create your Own Excetpions
class MyExceptions extends Exception
{
	private int details;
	MyExceptions(int a)
	{
		details = a;
	}
	public String toString()
	{
		return "My Exception ["+details+"]";
	}
}

class ExceptionExample
{
	public static void comput(int a) throws MyExceptions
	{
		if(a >10 )
			throw new MyExceptions(a);
		System.out.println("Normal To Exit");
	}
	
	public static void main(String args[])
	{
		try
		{
			comput(2);
			comput(20);
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}