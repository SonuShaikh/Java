// Handle mouse event in both Child and Applet Window
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// Create a Subclass of the Frame 
class SampleFrameM extends Frame implements MouseListener, MouseMotionListener{
	String smg = "";
	int mouseX = 30;
	int mouseY = 50;
	int movX, movY;
	
	SampleFrameM(String title){
		super(title);
		// add this listener to receive the events
		addMouseListener(this);
		addMouseMotionListener(this);
		// create a object to handle a window Event
		MyWindowAdapterMouse adapter = new MyWindowAdapterMouse(this);
		// Add object to receice the 
		addWindowListener(adapter);
	}
	//Handle a mouseClicked
	public void mouseClicked(MouseEvent me){
		smg = "Click";
		repaint();
	}
	// Hangle a MouseEnterd
	public void mouseEntered(MouseEvent me){
		smg = "Mouse just Entered in Child Window ";
		repaint();
	}
	// Handle a mouseExited
	public void mouseExited(MouseEvent me){
		smg = "Mouse Exit from Childe window";
		repaint();
	}
	//Handle mousePressed
	public void mousePressed(MouseEvent me){
		smg = "Down";
		repaint();
	}
	// Handle mouseReleased
	public void mouseReleased(MouseEvent me){
		smg = "Up";
		repaint();
	}
	//Handle mouseDragged
	public void mouseDragged(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		movX = me.getX();
		movY = me.getY();
		smg = "*";
		repaint();
	}
	//Handle mouseMoved
	public void mouseMoved(MouseEvent me){
		movX = me.getX();
		movY = me.getY();
		repaint(0,0,30,50);
	}
	public void paint(Graphics g){
		g.drawString(smg,mouseX,mouseY);
		g.drawString("mouse MOving at"+movX+ ","+movY,20,80);
	}
}
class MyWindowAdapterMouse extends WindowAdapter{
	SampleFrameM SF;
	MyWindowAdapterMouse(SampleFrameM sf){
		SF = sf;
	}
	public void windowClosed(WindowEvent we){
		SF.setVisible(true);
	}
}
public class FrameAppletMouseE extends Applet implements MouseListener, MouseMotionListener{
	String smg = "";
	int mouseX = 30;
	int mouseY = 50;
	int movX, movY;
	Frame f ;
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
		f = new SampleFrameM("SampleWindwoMouseEventFrame");
		f.setVisible(true);
		f.setSize(400,300);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	//Handle a mouseClicked
	public void mouseClicked(MouseEvent me){
		smg = "Click";
		repaint();
	}
	// Hangle a MouseEnterd
	public void mouseEntered(MouseEvent me){
		/* mouseX = me.getX();
		mouseY = me.getY(); */
		smg = "Mouse just Entered in Applet Window ";
		repaint();
	}
	// Handle a mouseExited
	public void mouseExited(MouseEvent me){
		smg = "Mouse Exit from Applet window";
		repaint();
	}
	//Handle mousePressed
	public void mousePressed(MouseEvent me){
		smg = "Down";
		repaint();
	}
	// Handle mouseReleased
	public void mouseReleased(MouseEvent me){
		smg = "Up";
		repaint();
	}
	//Handle mouseDragged
	public void mouseDragged(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		movX = me.getX();
		movY = me.getY();
		smg = "*";
		repaint();
	}
	//Handle mouseMoved
	public void mouseMoved(MouseEvent me){
		movX = me.getX();
		movY = me.getY();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(smg,mouseX,mouseY);
		showStatus("mouse MOving at"+movX+ ","+movY);
	}
}