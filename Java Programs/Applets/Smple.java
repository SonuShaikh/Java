// Write a program to setBackground and foreBackground 
import java.awt.*;
import java.applet.*;
public class Smple extends Applet
{
	private String msg;
	// setBackground and foreGround color 
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.green);
		msg= "Insidet the init() --";
	}
	// initial the msg to display
	public void start()
	{
		msg+= "Insidet the init() --";
	}
	// display the Method
	public void paint(Graphics g)
	{
		g.drawString(msg,10,15);
	}
}
