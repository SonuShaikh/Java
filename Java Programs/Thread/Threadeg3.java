// Stop
class sonu extends Thread
{
	public void run()
	{
		for(int i=0;i<5; i++)
		{
			System.out.println("i="+i);
		}
	}
}
class monu extends Thread
{
	public void run()
	{
		for(int j=1; j<=10; j++)
		{
			System.out.println("j="+j);
		}
	}
}
class Threadeg3
{
	public static void main(String args[])
	{
		sonu obj = new sonu();
		obj.setPriority(Thread.MIN_PRIORITY);
		obj.start();
		monu obj1 = new monu();
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
	}
}