// Main Thread Example
class CurrentThreadDemo
{
	public static void main(String args[])
	{
		Thread T = Thread.currentThread();
		
		System.out.println("Current THread : "+T);
		
		T.setName("MyThread");
		System.out.println("Thread Name : "+T);
		
		try
		{
			for(int i=5 ; i>0; i--)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
	}
}