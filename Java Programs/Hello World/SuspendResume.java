// Suspending Resuming Threads
class NewThread4 implements Runnable{
	String Name;
	Thread t;
	public NewThread4(String threadname){
		Name = threadname;
		t= new Thread(this,Name);
		System.out.println("New Thead is : "+t);
		t.start();
	}
	public void run(){
		try{
		for(int i =15; i>0; i--){
			System.out.println(Name+" : "+i);
			Thread.sleep(200);
		}
	}catch(InterruptedException e){
		System.out.println(Name+" Thread is Interrupted");
	}
	System.out.println(Name+" Thread is exited");
	}
}
class SuspendResume{
	public static void main(String args[]){
		NewThread4 ob1 = new NewThread4("one");
		NewThread4 ob2 = new NewThread4("Two");
		
		try{
			Thread.sleep(1000);
            ob1.t.suspend();
			System.out.println("Thread one is Suspend");
			Thread.sleep(1000);
			ob1.t.resume();
			System.out.println("Thread one is Resumed");
			ob2.t.suspend();
			System.out.println("Thread Two is Suspend");
			Thread.sleep(1000);
			ob2.t.resume();
			System.out.println("Thread Two is Resume");
		}catch(InterruptedException e ){
			System.out.println("Main Thread is Interrupted");
		}
		
		// Waiting for Thread to finished
		try{
			ob1.t.join();
			ob2.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Threa is Interrupted 2");
		}
		System.out.println("Main Thread is Exiting");
	}
}