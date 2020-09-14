// Bacis Thred Example
class ABC extends Thread
{
	public void run()
	{
		System.out.println("Good");
	}
}
class PQR extends Thread
{
	public void run()
	{
		System.out.println("Evening");
	}
}
class XYZ extends Thread
{
	public void run()
	{
		System.out.println("Student");
	}
}
class Threadeg
{
	public static void main(String args[])
	{
		ABC obj= new ABC();
		PQR obj1 = new PQR();
		XYZ obj2 = new XYZ();
		obj.start();
		obj1.start();
		obj2.start();
		
	}
}