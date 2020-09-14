//Taking input from user Throught Applet
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Input extends Applet 
{
	TextField t1, t2;
	public void init()
	{
		t1 = new TextField(8);
		t2 = new TextField(8);
		add(t1);
		add(t2);
		
	}
	
	public void paint(Graphics g)
	{
		int x,y,z;
		String s1,s2,s3;
		g.drawString("Input a number In each Text box",70,20);
		s1= t1.getText();
		x = Integer.parseInt(s1);
		s2 = t2.getText();
		y = Integer.parseInt(s2);
		z=x+y;
		s3= String.valueOf(z);
		g.drawString("Addition is :",10,80);
		g.drawString(s3,75,80);
	}
	
	public boolean action(Event e, Object o)
	{
		repaint();
		return true;
	}
}