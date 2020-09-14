// Calling the super class Members
class Base
{
	int i;
}
class Derived extends Base
{
	int i;
	Derived(int a, int b)
	{
		super.i=a;
		i=b;
	}
	void display()
	{
		System.out.println("i In the Base Class : "+super.i);
		System.out.println("i In the Derived Class :"+i);
	}
	
}


class CallSuperMember
{
	public static void main(String args[])
	{
		Derived obj= new Derived(10,20);
		obj.display();
	}
}