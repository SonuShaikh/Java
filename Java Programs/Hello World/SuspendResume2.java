//Mordern Way to Suspending and Resuming A Thread
class NewThread5 implements Runnable{
	String Name;
	Thread t;
	boolean mySuspendFlag;
	NewThread5(String threadname){
		Name = threadname;
		t= new Thread(this,Name);
		System.out.println("The new Thread is : "+t);
		mySuspendFlag = false;
		t.start();
	}
	
	// entry point for the 
	public void run(){
		try{
			for(int i = 15; i>0;i--){
				System.out.println(Name+ " : "+i);
				Thread.sleep(200);
				synchronized (this){
					while(mySuspendFlag){
						wait();
					}
				}
			}
		}catch(InterruptedException e){
			System.out.println(Name + " Threa is Interrupted");
		}
		System.out.println(Name+ " THread is Exiting");
	}
	
	void mySuspend(){
		mySuspendFlag = true;
	}
	synchronized void myRessume(){
		mySuspendFlag = false;
		notify();
	}
}
class SuspendResume2{
	public static void main(String args[]){
		NewThread5 ob1 = new NewThread5("One");
		NewThread5 ob2 = new NewThread5("Two");
		
		try{
			Thread.sleep(1000);
			ob1.mySuspend();
			System.out.println("Thread one is Suspended");
			Thread.sleep(1000);
			ob1.myRessume();
			System.out.println("Thread one is Resumed");
			ob2.mySuspend();
			System.out.println("Thread two is Suspending");
			Thread.sleep(1000);
			ob2.myRessume();
			System.out.println("Thead two is Resummed");
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		
		// waiting for Thread To finished
		try{
			System.out.println("Waiting for Threads to finished");
			ob1.t.join();
			ob2.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Thread is Interrupted");
		}
		System.out.println("Main Thread is Exitng");
	}
}