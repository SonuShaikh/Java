class NewThread implements Runnable{
	String name;
	Thread t;
	boolean suspendFlag;
	
	NewThread(String t_name)
	{
		name=t_name;
		t= new Thread(this,name);
		System.out.println("New Thread "+t+" has Begun");
		suspendFlag=false;
		t.start();
	}
	public void run()
	{
		try{
			for(int i=5; i>0;i--)
			{
				System.out.println(name+" : "+i);
				Thread.sleep(1000);
				synchronized(this)
				{
					
					while(suspendFlag)
					{
						wait();
					}
				}
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread Exception : "+e);
		}
		
		System.out.println("Thread "+name+" has Exited");
	}
	void threadSuspend()
	{
		suspendFlag= true;
	}
	
	synchronized void threadResume()
	{
		suspendFlag= false;
		notify();
	}
}

class ThreadImplement
{
           public static void main(String args[])
		   {
			   NewThread one = new NewThread("ThreadOne");
			   NewThread two = new NewThread("ThreadTwo");
			   
			   try{
				   
				   Thread.sleep(1000);
				   one.threadSuspend(); //Here we suspend the thread one
                   System.out.println("Thread one is Suspended");

                   Thread.sleep(1000);
                   one.threadResume();
                   System.out.println("Thread one is Resume");

                     Thread.sleep(1000);
					 two.threadSuspend();// Here Thread two is suspended;
					 System.out.println("Thread two is suspended");
					 Thread.sleep(1000);
					 two.threadResume();
					 System.out.println("Thead Two is Ressume");
					 
			   }catch(Exception e)
				   {
					   System.out.println("Interrupted Exception :"+e);
				   }
				   
				   try{
					   System.out.println("Thread is waitin for the ");
					   one.t.join();
					   two.t.join();
					   
				   }catch(Exception e){
					   System.out.println("IterruptedExcetion : "+e);
				   }
			   
		   }


}