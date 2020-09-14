// write a program to output the traphic single
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Filloval extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(200,30,40,40);
		g.setColor(Color.green);
		g.fillOval(200,90,40,40);
		g.setColor(Color.yellow);
		g.fillOval(200,150,40,40);
		g.setColor(Color.black);
		g.drawLine(190,20,190,200);
		g.drawLine(190,20,250,20);
		g.drawLine(250,20,250,200);
		g.drawLine(190,200,250,200);
		
		
	}
}