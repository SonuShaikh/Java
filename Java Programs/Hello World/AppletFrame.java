// Create a Childe Frame Window
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 // Create a Frame Window
class SampleFrame extends Frame{
	SampleFrame(String title){
		super(title);
		// creae an object to handle a window events
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		// register it to recive a window events
		addWindowListener(adapter);
	}
	public void paint(Graphics g){
		g.drawString("This is In Frame Window",50,60);
	}
}
class MyWindowAdapter extends  WindowAdapter {
	SampleFrame sampleframe;
	MyWindowAdapter(SampleFrame sampleframe){
		this.sampleframe = sampleframe;
	}
	public void windowClosing(WindowEvent we) { 
	sampleframe.setVisible(false); 
	}
}

// create a frame
public class AppletFrame extends Applet{
	Frame f;
	public void init(){
		f = new SampleFrame("The Frame Window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void paint(Graphics g){
		g.drawString("This is the applet Window ",10,20);
	}
} 




/* // Create a subclass of Frame. 
class SampleFrame extends Frame { SampleFrame(String title) { super(title); 
// create an object to handle window events
 MyWindowAdapter adapter = new MyWindowAdapter(this); 
 // register it to receive those events 
 addWindowListener(adapter); } public void paint(Graphics g) { g.drawString("This is in frame window", 10, 40); } }
class MyWindowAdapter extends WindowAdapter { SampleFrame sampleFrame; public MyWindowAdapter(SampleFrame sampleFrame) { this.sampleFrame = sampleFrame; } public void windowClosing(WindowEvent we) { sampleFrame.setVisible(false); } }
// Create frame window.

public class AppletFrame extends Applet { Frame f; public void init() { f = new SampleFrame("A Frame Window");
f.setSize(250, 250); f.setVisible(true);
} public void start() { f.setVisible(true); } public void stop() { f.setVisible(false); } public void paint(Graphics g) { g.drawString("This is in applet window", 10, 20); }
} */