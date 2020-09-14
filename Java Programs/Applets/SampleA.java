// 
import java.awt.*;
import java.applet.*;
public class SampleA extends Applet
{
	private String Name;
	
	public void init()
	{
		setBackground(Color.gray);
		setForeground(Color.red);
		Name = "Shaikh Shahabaj";
		
	}
	public void paint(Graphics g)
	{
		g.drawString(Name,25,30);
	}
}