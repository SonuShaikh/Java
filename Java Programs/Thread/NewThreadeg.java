//Here is an example that creates a new thread and starts it running
class NewThread implements Runnable
{
	NewThread()
	{
		Thread T = new Thread(this,"DemoThread");
		System.out.println("Child Thread : "+T);
		T.start();
	}
	public void run()
	{
		try
		{
			for(int i=5; i>0;i--)
			{
				System.out.println("Child Thread : "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted");
		}
		
		System.out.println("Exiting  Child Thread ");
	}
}

class NewThredeg
{
         public static void main(String args[])
		 {
			 new NewThread();
			 try
			 {
				
			     for(int i=5;i>0;i--)
			 {
				 System.out.println("Main Thread  : "+i);
				 Thread.sleep(1000);
			 }
			 }catch(InterruptedException e)
			 {
				 System.out.println("The Main Thread Is Intrrupted");
			 }
			 System.out.println("Exiting Main Thread");
		 }
}