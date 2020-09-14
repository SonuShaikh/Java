// Create a new Thread by extend Thread Class
class NewThread1 extends Thread{
	
	NewThread1(){
		//create a new Thread 
	super("DemoThread");
	System.out.println("The new Thread : "+this);
	start();
	}
	// This is the entry point for the new Thead
	public void run()
	{
		try{
			for(int i = 0; i<5 ; i++){
				System.out.println("Child Thread : "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("The Child Thread Interrupted");
		}
		System.out.println("The Child Thread Exited");
	}
	
}
class ExtendThread{
	public static void main(String args[]){
		new NewThread1();
		try{
			for(int i= 0; i<5;i++){
				System.out.println("Main Thread : "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted :"+e);
		}
		System.out.println("Mian Thread Exited");
	}
}