// program to the ABSTRACT CLASS 
abstract class Shonu 
{
	abstract void display();
	void show()
	{
		System.out.println("Simple Class");
	}
}
class Monu extends Shonu
{
	void display()
	{
		System.out.println("Abstrac Class okay");
	}
}
class Abstract
{
	public static void main(String arg[])
	{
		Monu obj=new Monu();
		obj.show();
		obj.display();
	}
}