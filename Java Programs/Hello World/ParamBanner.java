// Improving the banner applet by adding the parameter to it
import java.awt.*;
import java.applet.*;
public class ParamBanner extends Applet implements Runnable{
	String msg;
	Thread t;
	boolean stopFlag;
	
	// initialied the color
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	// start the Threads
	public void start(){
		msg = getParameter("messege");
		if(msg == null)
			msg = "Parameter NOt found";
		msg = " "+msg;
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	// this ist he intiali pont for thread to run
	public void run(){
		char ch;
		for( ; ; )
			try{
				repaint();
				Thread.sleep(250);
				ch = msg.charAt(0);
				msg = msg.substring(1,msg.length());
				msg +=ch;
				if(stopFlag)
					break;
			}catch(InterruptedException e){
				System.out.println("Thread Interrupted "+e);
			}
	}
	
	// stop the banner
	public void stop(){
		stopFlag = true;
	}
	// Display the Banner
	public void paint(Graphics g){
		g.drawString(msg,50,30);
		showStatus("This is Parameterize Banner");
	}
}