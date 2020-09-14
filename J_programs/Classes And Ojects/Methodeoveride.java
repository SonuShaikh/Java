// program to use of METHODE OVERRIDING in java
class Base1
{
	int n;
	int m;
	Base1(int n1, int m1)
	{
		n=n1;
		m=m1;
	}
	void show()
	{
		System.out.println("Value of N : " +n);
		System.out.println("Value of M : "+m);
	}
}
class Derived extends Base1
{
	int a;
	Derived(int n1,int m1, int a1)
	{
		super(n1,m1);
		a=a1;
	}
	void show()
	{
		System.out.println("Value of A : "+a);
	}
}

class Methodeoveride
{
	public static void main(String arg[])
	{
	   Derived obj=new Derived(1,2,3);
	   obj.show();
	}
}