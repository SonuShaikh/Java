// program to use of the classe and Ojbects
class super1
{
	int a;
	int b;
	super1(int x, int y)
	{
		a=x;
		b=y;
	}
}	
	class sub extends super1
	{
		int c;
		sub(int x, int y, int z)
		{
			super(x,y);
			c=z;
		}
		void display()
		{
			System.out.println("A :"+a);
			System.out.println("B :"+b);
			System.out.println("C :"+c);
		}		
	}

class Supereg
{
	public static void main(String arg[])
	{
		sub obj=new sub(10,20,30);
		obj.display();
	}
}