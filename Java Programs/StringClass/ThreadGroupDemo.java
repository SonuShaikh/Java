// Demonstrate the ThreadGroup
class NewThread extends Thread
{
	boolean suspendFlag;
	
	NewThread(String threadname, ThreadGroup tgob)
	{
		super(tgob, threadname);
		System.out.println("New Thread " + this);
		suspendFlag = false;
		start();// intialisation of thread
	}
	
	public void run()
	{
		try 
	    {
			for(int i = 5; i > 0 ; i--)
		{
			System.out.println(getName()+ " : "+i);
			Thread.sleep(2000);
			synchronized(this)
			{
				while(suspendFlag)
				{
					wait();
				}
			}
		}
		}catch (InterruptedException e)
		{
			System.out.println(getName()+ " Thread Interrupted");
		}
		 
		 System.out.println(getName()+" Exited");
	}
	
	void mysuspend()
	{
		suspendFlag = true;
	}
	synchronized void myresume()
	{
		suspendFlag = false;
		notify();
	}
}
class ThreadGroupDemo
{
	public static void main(String args[])
	{
		ThreadGroup groupA = new ThreadGroup("Group A");
		ThreadGroup groupB = new ThreadGroup("Group B");
		
		NewThread obj1 = new NewThread("one",groupA);
		NewThread obj2 = new NewThread("Two",groupA);
		NewThread obj3 = new NewThread("Three",groupB);
		NewThread obj4 = new NewThread("Four", groupB);
		
		System.out.println("\n\n Here is the Output form the list() : ");
		groupA.list();
		groupB.list();
		
		System.out.println();
		System.out.println("Suspending Group A");
		Thread gta[] = new Thread[groupA.activeCount()];
		groupA.enumerate(gta); // get Thread in Group
		
		for(int i = 0 ;i<gta.length; i++)
		{
			((NewThread)gta[i]).mysuspend();
		}
		try
		{
			Thread.sleep(5000);
		}catch (InterruptedException e)
		{
			System.out.println("Main Thread Interrupted ");
		}
		
		System.out.println("\n Grout A thread Resume");
		for(int i=0 ; i<gta.length ; i++)
		{
			((NewThread)gta[i]).myresume();
		}
		
		// wait for each Threa is to Finished
		
		try
		{
			obj1.join();
			obj2.join();
			obj3.join();
			obj4.join();
		}catch (InterruptedException e)
		{
			System.out.println("Exception in main Thread");
		}
		System.out.println("Maint Thread Exited");
	}
}