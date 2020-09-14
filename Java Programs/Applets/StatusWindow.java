// ShowStatus
import java.awt.*;
import java.applet.*;
public class StatusWindow extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is the Applet Window",20,30);
		showStatus("This is the Status Window");
	}
}