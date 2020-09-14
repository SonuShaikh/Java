// write a program to Drawccylinder;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Cylinder extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawOval(200,50,60,20);
		g.drawLine(200,58,200,155);
		g.drawLine(260,63,260,155);
		g.drawOval(200,150,60,20);
	}
}