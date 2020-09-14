// Handling the mouse Event
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{
	String smg = " ";
	int mouseX , mouseY;
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.cyan);
        setForeground(Color.red);
	}
	// mouse Clicked
	public void mouseClicked(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		smg = "Mouse Clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me){
		mouseX  = 0;
		mouseY  = 10;
		smg = "Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		smg = " MOuse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		smg = "Down";
		repaint();
	}
	public void mouseReleased(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		smg = "Up";
		repaint();
	}
	public void mouseDragged(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		smg = "*";
		showStatus("Mouse Dragging at : "+mouseX+":"+mouseY);
		repaint();
	}
	public void mouseMoved(MouseEvent me){
		showStatus("Mouse Moving at : "+me.getX()+ ","+ me.getY());
	}
	public void paint(Graphics g){
		g.drawString(smg,mouseX ,mouseY);
	}
}