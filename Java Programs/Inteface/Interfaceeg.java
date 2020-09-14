// Access Interface Varialbe
interface X
{
	int m=10;
	int n=20;
}
class A implements X
{
	void display()
	{
		System.out.println(m);
	}
}

class Interfaceeg
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.display();
	}
}