// isAlive() and join() methodes
class NewThread3 implements Runnable
{
	String name;
	Thread t;
	
	NewThread3(String threadName)
	{
		name = threadName;
		t =  new Thread(this,name);
		System.out.println("New Thread : "+t);
		t.start();
	}
	
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try
			{
				System.out.println(name+ " : "+i);
				t.sleep(1000);
			}catch(InterruptedException e)
			{
				System.out.println(name+ "Thread Interrupted");
			}
			
		}
		System.out.println(name+" Thread Exited");
	}
     

}
class NewThreadeg3
{
	public static void main(String args[])
	{
		NewThread3 obj  = new NewThread3("one");
		NewThread3 obj1 = new NewThread3("Two");
		NewThread3 obj2 = new NewThread3("Three");
		
		
		
			System.out.println("Thread one is Alive : "+obj.t.isAlive());
			System.out.println("Thread Two is Alive : "+obj1.t.isAlive());
			System.out.println("Thread Three is Alive : "+obj2.t.isAlive());
			
			System.out.println("Waiting for the Thread is Finished : "); 
			try
			{
				obj.t.join();
				obj1.t.join();
				obj2.t.join();
				
			
			}catch(InterruptedException e)
		{
			System.out.println("Main Thread Interruped");
		}
			
			System.out.println("Thread one is Alive : "+obj.t.isAlive());
			System.out.println("Thread Two is Alive : "+obj1.t.isAlive());
			System.out.println("Thread Three is Alive : "+obj2.t.isAlive());
			
	     System.out.println("Main Thread is Interrupted");	
		
	}
}