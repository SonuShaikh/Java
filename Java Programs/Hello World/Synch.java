  // This is not Synchronized
  class Call{
	  public void callme(String smg){
		  System.out.print("["+smg);
		  try{
			  Thread.sleep(1000);
		  }catch(InterruptedException e){
			  System.out.println("Interrupted ");
		  }
		  System.out.println("]");
	  }
  }
  class Caller implements Runnable{
	  String s;
	  Thread t;
	  Call target;
	  
	  public Caller(Call trgt, String a){
		  target = trgt;
		  s = a;
		  t = new Thread(this);
		  t.start();
	  }
	  public void run(){
		  target.callme(s);
	  }
  }
  class Synch{
	  public static void main(String args[]){
		  Call target = new Call();
		  Caller ob1  = new Caller(target,"Hello");
		  Caller ob2  = new Caller(target,"Synchronized");
		  Caller ob3  = new Caller(target,"World");
		  
		  
		  // wait for the Thead End
		  try{
			  ob1.t.join();
			  ob2.t.join();
			  ob3.t.join();
		  }catch(InterruptedException e){
			  System.out.println("Interrupted");
		  }
	  }
  }
  