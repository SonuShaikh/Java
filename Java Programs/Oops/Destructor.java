// write a program to use of the finilizer
class A
{
	A()
	{
		System.out.println("Inside the Class A");
	}
	protected void finalize()
	{
		System.out.println("Object destroud");
	}
	
}


class Destructor
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.show();
	}
} 