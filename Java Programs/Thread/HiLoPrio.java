// Demonstration of Set Priority
class Clocker implements Runnable
{
	long clock = 0;
	Thread t;
	private volatile boolean running = true;
	
	Clocker (int p)
	{
		t = new Thread(this);
		t.setPriority(p);
	}
	public void run()
	{
		while(running)
		{
			clock++;
		}
	}
	void stop()
	{
		running = false;
	}
	void start()
	{
		t.start();
	}
}
class HiLoPrio
{
	public static void main(String args[])
	{
		Clocker lo = new Clocker(Thread.NORM_PRIORITY+2);
		Clocker hi = new Clocker(Thread.NORM_PRIORITY-2);
		lo.start();
		hi.start();
		
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println("Interrupted Error");
		}
		lo.stop();
		hi.stop();
		try
		{
			hi.t.join();
			lo.t.join();
		
		
		}catch(InterruptedException e)
		{
			System.out.println("Enterrupted Exception"+e);
		}
		
		System.out.println("Lower Priority Thread "+lo.clock);
		System.out.println("Higher Priority Thread "+hi.clock);
		
	}
}