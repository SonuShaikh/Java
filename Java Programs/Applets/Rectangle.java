// write an applet to draw a rectangle
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Rectangle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(10,10,50,60);
		g.fillRect(100,10,50,60);
		g.drawRoundRect(190,10,90,90,15,15);
		g.fillRoundRect(70,90,140,100,30,40);
	}
}