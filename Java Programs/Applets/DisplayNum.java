// write an applet to input two number m & n and print the all number between m & n;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class DisplayNum extends Applet
{
	TextField t1,t2;
	
	public void init()
	{
		t1 = new TextField(5);
		t2 = new TextField(5);
		add(t1);
		add(t2);
		setBackground(Color.pink);
		setForeground(Color.black);
	}
	
	public void paint(Graphics g)
	{
		int x, y;
		int pX = 100, pY = 150;
		String s1,s2;
		g.drawString("Enter Number in Each Text box",40,80);
		s1 = t1.getText();
		x= Integer.parseInt(s1);
		s2 = t2.getText();
		y = Integer.parseInt(s2);
		
		for(int i = x; i<=y; i++)
		{
			s2 = String.valueOf(i);
			g.drawString(s2,pX,pX);
			pX+=3;
			pY+=3;
		}
	}
	public boolean event(Event e, Object o)
	{
		repaint();
		return true;
	}
} 
 