//
import java.awt.*;
import java.applet.*;
public class SonuMonu extends Applet implements Runnable
{
	private String msg = "The Welcome To The Banner Applet";
	Thread t ;
    boolean stopFlag;
    

		public void init()
		{
			setBackground(Color.red);
			setForeground(Color.yellow);
			
		}
		
		public void start()
		{
			t= new Thread(this);
			stopFlag = false;
			t.start();
		}
		
		public void run()
		{
			for( ; ;)
			try
			{
				
				Character ch;
				repaint();
			t.sleep(300);
			ch =msg.charAt(0);
			msg = msg.substring(1,msg.length());
			msg = msg+ch;
			
			if(stopFlag)
				break ;
			}catch(InterruptedException e)
			{
				System.out.println("Thread Exception");
			}
			
		}
		
		public void stop()
		{
			stopFlag = false;
			t = null;
		}
		
		public void paint(Graphics g)
		{
			g.drawString(msg,40,50);
		}
}
