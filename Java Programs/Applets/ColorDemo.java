// write an applet to demonstrate color class
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ColorDemo extends Applet
{
	public void paint(Graphics g)
	{
		Color c1 = new Color(100,240,200);
		Color c2 = new Color(200,150,70);
		Color c3 = new Color(170,150,190);
		
		g.setColor(c1);
		g.drawLine(0,0,100,100);
		g.drawLine(0,40,50,50);
		
		g.setColor(c2);
		g.drawLine(100,100,200,200);
		g.drawLine(100,50,300,300);
		
		g.setColor(c3);
		g.fillOval(10,20,40,40);
		g.drawOval(40,50,60,60);
	}
}