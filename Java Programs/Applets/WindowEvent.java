// create Event for Frame Window As well as For Event
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class MouseEventFrame extends Frame implements MouseListener, MouseMotionListener
{
	int mouseX = 0;
	int mouseY = 0;
	int movX=0;
	int movY=0;
	String smg = "";
	MouseEventFrame(String title)
	{
		super(title);
		addMouseListener(this);
		addMouseMotionListener(this);
		MyMouseEventAdapter adapter = new MyMouseEventAdapter(this);
		addWindowListener(adapter);
		
	}
	// mouse Clicked
	public void mouseClicked(MouseEvent me)
	{
		smg = "Clicked";
	}
	// Mouse Enterd
	public void mouseEntered(MouseEvent me)
	{
		mouseX = 10;
		mouseY = 20;
		smg = "Mouse just Entered in Child Window";
		repaint();
	}
	//  MouseExited 
	public void mouseExited(MouseEvent me)
	{
		mouseX = 10;
		mouseX = 20;
		smg= "Mouse just Exited from Child Window";
		repaint();
	}
	// mouse Pressed
	public void mousePressed(MouseEvent me)
	{
		mouseX = 10;
		mouseY = 20;
		smg = "Down";
		repaint();
	}
	// mouse Released
	public void mouseReleased(MouseEvent me)
	{
		mouseX = 10;
		mouseY = 20;
		smg = "Up";
		repaint();
	}
	// mouse Dragged
	public void mouseDragged(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		movX = me.getX();
		movY = me.getY();
		smg = "*";
		
		repaint();
	}
	//mouse Moved
	public void mouseMoved(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		movX = me.getX();
		movY = me.getY();
		
		repaint(0,0,100,60);
	}
	public void paint(Graphics g)
	{
		g.drawString(smg,mouseX, mouseY);
		g.drawString("Mouse at " + movX + ", " + movY, 0, 10);

	}
}
class MyMouseEventAdapter extends  WindowAdapter
{
	MouseEventFrame mef;
	MyMouseEventAdapter( MouseEventFrame mef)
	{
		this.mef = mef;
	}
	public void windowClosing(WindowEvent we)
	{
		mef.setVisible(false);
	}
}


public class WindowEvent extends Applet implements MouseListener , MouseMotionListener
{
	int mouseX = 0;
	int mouseY = 0;
	int movX=0;
	int movY=0;
	String smg = "";
	Frame f;
	public void init() 
	{
		f= new MouseEventFrame("FrameWindos");
		f.setSize(250,250);
		f.setVisible(false);
		
		addMouseListener(this);
	    addMouseMotionListener(this);		
	}
	
    public void start()
	{
		f.setVisible(true);
	}	
	public void stop()
	{
		f.setVisible(false);
	}
	
	// mouse Clicked
	public void mouseClicked(MouseEvent me)
	{
		
	}
	
	// Mouse Enterd
	public void mouseEntered(MouseEvent me)
	{
		mouseX = 10;
		mouseY = 20;
		smg = "Mouse just Entered in Child Window";
		repaint();
	}
	//  MouseExited 
	public void mouseExited(MouseEvent me)
	{
		mouseX = 10;
		mouseX = 20;
		smg= "Mouse just Exited from Child Window";
		repaint();
	}
	// mouse Pressed
	public void mousePressed(MouseEvent me)
	{
		mouseX = 10;
		mouseY = 20;
		smg = "Mouse Entered ";
		repaint();
	}
	// mouse Released
	public void mouseReleased(MouseEvent me)
	{
		mouseX = 10;
		mouseY = 20;
		smg = "mouse Released";
		repaint();
	}
	// mouse Dragged
	public void mouseDragged(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		movX = me.getX();
		movY = me.getY();
		smg = "*";
		repaint();
	}
	//mouse Moved
	public void mouseMoved(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		movX = me.getX();
		movY = me.getY();
		
		repaint(0,0,100,60);
	}
	public void paint(Graphics g)
	{
		g.drawString(smg,mouseX, mouseY);
		g.drawString("Mouse at " + movX + ", " + movY, 0, 10);

	}
}