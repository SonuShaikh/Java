// write a program to demont Strate use of the Super Keyword
 
 class superex
 {
	 int a;
	 int b;
	 superex(int c, int d)
	 {
		 a=c;
		 b=d;
	 }
 }
 class sub extends superex
 {
	 int t;
	 sub(int c, int d, int e)
	 {
		 super(c,d);
		 t = e;
	 }
	 void display()
	 {
		 System.out.println("A = "+a);
		 System.out.println("B = "+b);
		 System.out.println("T = "+t);
	 }
 }


class Supereg
{
	public static void main(String args[])
	{
		sub obj = new sub(1,2,3);
		obj.display();
	}
}