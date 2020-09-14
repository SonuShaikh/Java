// display the numeric result
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Sum extends Applet
{
	public void init()
	{
		setBackground(Color.green);
		setForeground(Color.blue);
	}
	public void paint(Graphics g)
	{
		int num1=20;
	    int num2=39;
	    int sum;
	
	    sum = num1+num2;
	
	    String s = String.valueOf(sum);
	    g.drawString(s,10,20);
	}
}