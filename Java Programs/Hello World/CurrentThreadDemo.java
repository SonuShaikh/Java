// program to control a main thread
class CurrentThreadDemo{
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println("Current Thread is : "+t);
		
		// chanching name of the Thread
		t.setName("MyThread");
		System.out.println("After Change name: "+t);
		try{
			for(int n=5 ; n>0 ; n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread is Interrupted ");
		}
	}
}