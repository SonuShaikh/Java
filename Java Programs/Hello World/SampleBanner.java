// Sample Banner Applet 
import java.awt.*;
import java.applet.*;
public class SampleBanner extends Applet implements Runnable{
	String smg = " This is the Sample banner ";
	Thread t = null;
	boolean stopFlag;
	
	
	// Initialize the color
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	// start the Thread
	public void start(){
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	// This is the entry point of Thread to run
	public void run(){
		char ch;
		for( ; ; )
		try{
			repaint();
			Thread.sleep(300);
			ch = smg.charAt(0);
			smg = smg.substring(1,smg.length());
			smg = smg + ch;
			if(stopFlag){
				break;
			}
				
		}catch(InterruptedException e){
			System.out.println("Thread Interrupted : "+e);
		}
	}
	
	// Strop the Thread 
	public void stop(){
		stopFlag  = true;
	}
	// Display the containts
	public void paint(Graphics g){
		g.drawString(smg,10,40);
	}
}