// Write a program to input a number from user and factorial
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class FactApplet extends Applet
{
	TextField t1;
	public void init()
	{
		t1 = new TextField(20);
		add(t1);
		setBackground(Color.blue);
		setForeground(Color.red);
		setFont(new Font("SansSerif",Font.ITALIC,20));
		
	}
	public void paint(Graphics g)
	{
		int x ,y,fact = 1;
		String a,b;
		g.drawString("Input the number in TextBox",10,70);
		a=t1.getText();
		x = Integer.parseInt(a);
		for(int i = 1; i<=x; i++)
		{
			fact = fact * i;
		}
		b = String.valueOf(fact);
		g.drawString("Factorial : ",50,100);
		g.drawString(b,200,100);
	}
	public boolean action (Event e, Object o)
	{
		repaint();
		return true;
	}
	
}