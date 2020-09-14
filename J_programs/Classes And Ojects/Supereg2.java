// program to Access Super class members

class Base
{
	int n;
	String s;
	Base(int a, String sa)
	{
		n=a;
		s=sa;
	}
}
class derived extends Base
{
	int n;
	String s;
	derived(int a, String s, int b, String sa)
	{
		super(a,s);
		n=b;
		s = sa;
	}
	void display()
	{
		System.out.println("N In the Super Class : "+ super.n);
		System.out.println("N in the Based class : " + n);
		System.out.println("String in the Super class : "+ super.s);
		System.out.println("String in the base class : " + s);
	}
	
    
}
class Supereg2
{
	public static void main(String arg[])
	{ 
	
		
		derived obj=new derived(10,"sonu",20,"Anita");
		obj.display();
	 
	}
}