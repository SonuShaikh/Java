// demonstrate the useo fo the keyHadeler Event by 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class SimpleKey extends Applet implements KeyListener
{
	String smg = "";
	
	public void init()
	{
		addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent ke)
	{
		showStatus("keyPressed");
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("KeyReleased");
	}
	public void keyTyped(KeyEvent ke)
	{
		smg += ke.getKeyChar();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(smg,10,20);
	}
}