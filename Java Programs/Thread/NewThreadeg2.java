// Creating a Multiple Threads
class NewThread2 implements Runnable
{
     String Name;
	 Thread t;
	 NewThread2(String threadName)
	 {
		 Name = threadName;
		 t=new Thread(this,Name);
		 System.out.println("New Thread : "+t);
		 t.start();
	 }
	 public void run()
	 {
		 try
		 {
			 for(int i=5; i>0;i--)
			 {
				 System.out.println(Name+" : "+i);
				 Thread.sleep(1000);
			 }	 
			 
		 }catch(InterruptedException e)
		 {
			 System.out.println("Child Thread InterruptedException");
		 }
		 System.out.println(Name+"Thread Exited");
	 }
}
class NewThreadeg2
{
	public static void main(String args[])
	{
		new NewThread2("one");
		new NewThread2("Two");
		new NewThread2("Three");
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exited");
	}
}