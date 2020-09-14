// Abstract class and Abstract Methods

abstract class Base
{
	abstract void display();
	void show()
	{
		System.out.println("Simple Abstract class Methods");
	}
}
class Derived extends Base
{
	void display()
	{
		System.out.println("Abstract Method");
	}
}
class Abstracteg
{
	public static void main(String args[])
	{
		Derived obj= new Derived();
		obj.show();
		obj.display();
	}
}