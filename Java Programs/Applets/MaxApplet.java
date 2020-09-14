// write an applet accepte two number and display the Maximum number
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MaxApplet extends Applet
{
	TextField t1,t2;
	public void init()
	{
		t1= new TextField(10);
		t2= new TextField(10);
		add(t1);
		add(t2);
		setBackground(Color.blue);
		setForeground(Color.red);
		setFont(new Font("SansSerif",Font.ITALIC,20));
	}
	 public void paint(Graphics g)
	 {
		 int x,y;
		 String s1,s2;
		 g.drawString("Enter the Value in Each TextBoxes ",70,80);
		 s1 = t1.getText();
		 x = Integer.parseInt(s1);
		 s2 = t2.getText();
		 y = Integer.parseInt(s2);
		 if(x>y)
		 {
			 g.drawString("The Largest No : "+x,100,100);
		 }
		 else
		 {
			 g.drawString("The Largest No : "+y,100,100);
		 }
	 }
	 public boolean action(Event e, Object o)
	 {
		 repaint();
		 return true;
	 }
}