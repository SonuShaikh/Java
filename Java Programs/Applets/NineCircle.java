// write a applet to get followind output
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class NineCircle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(20,20,20,20);
		g.fillOval(50,20,20,20);
		g.drawOval(80,20,20,20);
		g.fillOval(20,50,20,20);
		g.drawOval(50,50,20,20);
	    g.drawOval(50,50,20,20);
		g.fillOval(80,50,20,20);
		g.drawOval(20,80,20,20);
		g.fillOval(50,80,20,20);
		g.drawOval(80,80,20,20);  
	}
}