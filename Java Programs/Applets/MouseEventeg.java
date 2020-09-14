// mouseEventLIststen example
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public  class MouseEvents extends Applet implements MouseListener , MouseMotionListener
{
	String smg ;
	int mouseX=0, mouseY=0; // co-oridinate of the MouseAdapter
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		// save co-oridinates position to display a message
		mouseX = 0;
		mouseY = 10;
		smg = "Mouse Clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		mouseX = 0;
		mouseY = 0;
		smg= "Mouse Entered";
		repaint();
		
	}
	public void mouseExited(MouseEvent me)
	{
		mouseX = 0;
		mouseY= 0;
		smg = "Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
	   mouseX = me.getX();
	   mouseY = me.getY();
	   smg="Mouse Pressed";
	   repaint();
	}
	
	public void mouseRealesed(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		smg= "Mouse Released ";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		smg= "*";
		showStatus("Dragging mouse at "+mouseX+ ","+mouseY);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("mouse move at"+me.getX()+","+me.getY());
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(smg,mouseX,mouseY);
	}
	
	
}