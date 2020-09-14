// Dynamic Dispatching
class A
{
	void show()
	{
		System.out.println("Inside the Class A ");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Inside the Class B ");
	}
}
class C extends B
{
	void show()
	{
		System.out.println("Inside the Class C");
	}
}
class DynDispatch
{
	public static void main(String args[])
	{
		A obja = new A();
		A objb = new B();
		A objc = new C();
		obja.show();
		objb.show();
		objc.show();
		
	}
}