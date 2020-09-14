// Creating a multiple Threads 
class NewThread2 implements Runnable{
	String name;
	Thread t;
	NewThread2(String threadname){
		name = threadname;
		t= new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(int i= 5; i>0;i--){
			System.out.println(name+" : "+i);
			t.sleep(1000);
		}
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted");
		}
		System.out.println(name+"Exited");
	}
}

class MultiThreadDemo{
	public static void main(String args[]){
		new NewThread2("one");
		new NewThread2("two");
		new NewThread2("thr");
		
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted ");
		}
		System.out.println("Main Thread Exited");
		
	}
}