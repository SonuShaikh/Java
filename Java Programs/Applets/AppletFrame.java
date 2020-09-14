// creating the frame window 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class SampleFrame extends Frame
{
	SampleFrame (String title)
	{
		super(title);
		// create an Object tha hanndele the Window event
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		// resister it to ricive those events 
		addWindowListener(adapter);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This is the Frame Window",10,40);
	}
	
}
class MyWindowAdapter extends WindowAdapter
{
	SampleFrame sampleframe;
	MyWindowAdapter(SampleFrame sampleframe)
	{
		this.sampleframe = sampleframe;
	}
	public void windowClosing(WindowEvent we)
	{
		sampleframe.setVisible(false);
	}
}
// creaate the Applet Window
public class AppletFrame extends Applet
{
	Frame f;
	public void init()
	{
		f = new SampleFrame("A Sample Frame");
		f.setSize(250,300);
		f.setVisible(true);
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