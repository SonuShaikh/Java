// Stop
class sonu extends Thread
{
	public void run()
	{
		for(int i=0;i<5; i++)
		{
			if(i==3)
			{
				
				System.out.println("i="+i);
			}
		}
	}
}
class monu extends Thread
{
	public void run()
	{
		for(int j=1; j<=10; j++)
		{
			if(j==5)
			try
			{
				sleep(2000);
			}catch(Exception e)
			{
				System.out.println("Exception Caught : "+e);
			}
			System.out.println("j="+j);
		}
	}
}
class Threadeg2
{
	public static void main(String args[])
	{
		sonu obj = new sonu();
		obj.start();
		monu obj1 = new monu();
		obj1.start();
	}
}