//This is the Synchronized 
class Callme{
	public void call(String smg){
		System.out.print("["+smg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Interrupted ");
		}
		System.out.println("]");
	}
}
class Caller1 implements Runnable{
	String smg;
	Thread t;
	Callme Target;
	
	public Caller1(Callme trgt , String s){
		Target = trgt;
		smg = s;
		t =new Thread(this);
		t.start();
	}
	
	// Synchronized block
	public void run(){
		synchronized(Target){
			//Synchronized block 
			Target.call(smg);
		}
	}
}
class Synch1{
	public static void main(String args[]){
		Callme target = new Callme();
		Caller1 ob1 = new Caller1(target,"Welcome");
		Caller1 ob2 = new Caller1(target,"Synchronized");
        Caller1 ob3 = new Caller1(target,"World");

            // Wait for Thread to end
          try{
			  ob1.t.join();
			  ob2.t.join();
			  ob3.t.join();
			  
		  }catch(InterruptedException e){
			  System.out.println("InterruptedException");
		  }	
	}
}