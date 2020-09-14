// Create  a new second thread and start it
class NewThread implements Runnable{
	Thread t; // Thread instance Created
   
    NewThread(){
		t=new Thread(this,"ChildThread");
		System.out.println("The Child Thread : "+t);
		t.start();
	}
	
	public void run(){
		try{
			for(int i=5 ; i>0 ; i--){
				System.out.println("Child Thread : "+i);
				t.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted "+e);
		}
		System.out.println("Child Thread Exited");
	}
    	
}
class ThreadDemo{
	public static void main(String args[]){
		new NewThread();
		try{
			for(int n=0 ; n<5 ; n++)
			{
				System.out.println("Main  Thread : "+n);
			}
			Thread.sleep(1000);
	        }catch(InterruptedException e){
		System.out.println("Main Thread Interrupted "+e);
	}
	System.out.println("Main Thread Exited");	
}
}