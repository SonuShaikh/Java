// Write a progaram to OverRiding a Methodes
class BASE
{
	int a;
	int b;
	 BASE(int x, int y)
	 {
		 a=x;
		 b=y;
	 }
	 void show()
	 {
		 System.out.println(" A : "+a);
		 System.out.println(" B : "+b);
	 }
}
class DERIVED extends BASE
{
	int c;
	DERIVED(int x, int y, int z)
	{
		super(x,y);
		c=z;
	}
	void show()
	{
		System.out.println(" C : "+c);
	}
}
class OverridingMethod
{
	public static void main(String args[])
	{
		DERIVED obj = new DERIVED(1,2,3);
		obj.show();
	}
}