// Frame Example
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class WindowFrame extends Frame
{
	WindowFrame(String title)
	{
		super(title);
		// creating an Object 
		MyFrameWindowAdapter adapter = new MyFrameWindowAdapter(this);
		// Initiliasatino fo the event
		addWindowListener(adapter);
	}
}
class MyFrameWindowAdapter extends WindowAdapter
{
	WindowFrame windowframe;
	MyFrameWindowAdapter(WindowFrame windowframe)
	{
		this.windowframe= windowframe;
	}
	public void windowClosing(WindowEvent we)
	{
		windowframe.setVisible(false);
	}
}
public class WindowApplet extends Applet
{
	Frame f;
	public void init()
	{
		f = new WindowFrame("WindowFrames");
		f.setSize(250,250);
		f.setVisible(false);
	}
	public void start()
	{
		f.setVisible(true);
	}
	public void stop()
	{
		f.setVisible(false);
	}
}