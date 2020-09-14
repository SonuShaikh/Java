// Program to display a Simple Banner
import java.awt.*;
import java.applet.*;
public class SampleBanner extends Applet implements Runnable
{
	private String str = "Hello This is the First Banner Program of the sonu shaikh okk .";
	Thread T = null;
	int stat;
	boolean stopFlag;
	// initilais the colors
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.yellow);
		
	}
	
	// Statr the Thread 
	public void start()
	{
		T = new Thread(this);
		stopFlag = false;
		T.start();
	}
	
	// Entry point for Banner That rum the Thread
	public void run()
	{
		Character ch;
		// display the Banner
		for(; ;)
			try
			{
				repaint();
				Thread.sleep(150);
				ch = str.charAt(0);
				str =str.substring(1,str.length());
				str+= ch;
				if(stopFlag)
					break;
				
			}catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted");
			}
			
			
	}
	
	  // Pause Banner
			public void stop()
			{
				stopFlag = false;
				T= null;
			}
			
			// display Banner
			public void paint(Graphics g)
			{
				g.drawString(str,20,30);
			}
}