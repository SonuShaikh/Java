// Create a childe frame window
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class SampleFrame1 extends Frame{
	SampleFrame1(String title){
		super(title);
		// Create an object to Handle a windows events
		MyWindowAdpater1 adapter = new MyWindowAdpater1(this);
		// Register it to recive the events
		addWindowListener(adapter);
	}
	public void paint(Graphics g){
		g.drawString("This is the New Frame Window",50,50);	
	}
}
class MyWindowAdpater1 extends WindowAdapter{
	SampleFrame1 sampleFrame ;
	MyWindowAdpater1(SampleFrame1 sampleFrame){
		this.sampleFrame = sampleFrame;
	}
	
	public void windowClosing(WindowEvent we){
		sampleFrame.setVisible(false);
	}
}
public class AppletFrame1 extends Applet{
	
	Frame f;
	public void init(){
		f = new SampleFrame1("The Sample Frame");
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void paint(Graphics g){
		showStatus("The Applet Window");
		g.drawString("This is the another AppletVindow",10,20);
	}
}