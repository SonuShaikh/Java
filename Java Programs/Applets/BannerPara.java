// Banner with the Parameters
import java.awt.*;
import java.applet.*;
public class BannerPara extends Applet implements Runnable
{
	String smg;
	Thread t;
	boolean stopFlag;
	
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.green);
		
	}	
	public void start()
	{
		smg = getParameter("Message");
		if(smg == null)
			smg = "Messege Not Found";
		
		t = new Thread(this);
		stopFlag=false;
		t.start();
	}
	public void run()
	{
		Character ch;
		for(; ;)
		{
			try
			{
				repaint();
			t.sleep(250);
			ch = smg.charAt(0);
			smg=smg.substring(1,smg.length());
			smg = smg+ch;
			if(stopFlag)
				break;
			}catch(InterruptedException e)
			{
				System.out.println("InterruptedException");
			}
		}
	}
	public void stop()
	{
		stopFlag = true;
		t = null;
	}
	public void paint(Graphics g)
	{
		g.drawString(smg,25,50);
	}
}