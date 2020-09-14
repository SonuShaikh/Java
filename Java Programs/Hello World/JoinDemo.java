// Program to demonstrate user of the join() and isAlive() methodes
class NewThread3 implements Runnable{
	String Name;
	Thread t;
	NewThread3(String threadName ){
		Name = threadName;
		t = new Thread(this,Name);
		System.out.println("The New Thread is : "+t);
		t.start();
	}
	
	public void run(){
		try{
			for(int i=5; i>0; i--){
				System.out.println(Name+ " : "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(Name+" Child Thread Interrupted");
		}
		System.out.println(Name+" THread Exited");
	}
}
class JoinDemo{
	public static void main(String args[]){
		NewThread3 ob1 = new NewThread3("One");
		NewThread3 ob2 = new NewThread3("Two");
		NewThread3 ob3 = new NewThread3("Three");
		
		System.out.println("Thread one is Alive : "+ob1.t.isAlive());
		System.out.println("Thread Two is Alive : "+ob2.t.isAlive());
		System.out.println("Thread Three is Alive : "+ob3.t.isAlive());
		
		// wait for Thread to finish
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch (InterruptedException e){
			System.out.println("The Main Thread is Interrupted :");
		}
		
		System.out.println("Thread one is Alive : "+ob1.t.isAlive());
		System.out.println("Thread Two is Alive : "+ob2.t.isAlive());
		System.out.println("Thread Three is Alive : "+ob3.t.isAlive());
		
		System.out.println("Main Threa is Exited");
	}
}