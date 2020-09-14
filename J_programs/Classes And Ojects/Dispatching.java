// Introduction to the DINAMIC DIAPATCHING 
class A
{
	void show()
	{
		System.out.println("Hey I'm From The Class A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Hey I'm From the Class B");
	}
}
class C extends A
{
	void show()
	{
		System.out.println("Hey I'm From the Class C");
	}
}

class Dispatching
{
	public static void main(String arg[])
	{
		A obj=new A();
		
		obj.show();
		A obj1=new B();
		obj1.show();
		A obj2=new C();
		obj2.show();
	}
}