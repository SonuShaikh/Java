// getCodeBase() getDocumentBase()
import java.awt.*;
import java.applet.*;
import java.net.*;
public class Basess extends Applet
{
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.black);
	}
	public void paint(Graphics g)
	{
		String msg;
		URL url = getCodeBase(); // get code base here
		msg = "Code Base : "+url.toString();
		g.drawString(msg,10,20);
		
		 url = getDocumentBase();// get documet base here
		msg = "Document Base : "+url.toString();
		g.drawString(msg,20,40);
	}
}