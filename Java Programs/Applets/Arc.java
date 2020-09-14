// draw the Args
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Arc extends Applet
{
	public void paint(Graphics g)
	{
		g.fillArc(10,40,70,70,0,180);
		g.fillArc(50,50,50,50,0,-70);
		g.fillArc(100,150,100,100,0,270);
		
	}
}