// 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class SimpleKeyboard extends Applet implements KeyListener
{
	int keyX=10;
	int keyY=20;
	public void init()
	{
		addKeyListener(this);
	}
	String message="";
	public void keyPressed(KeyEvent ke)
	{
		
		showStatus("keyPressed at");
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("KeyReleased");
	}
	public void keyTyped(KeyEvent ke)
	{
		showStatus("keyPressed");
		message += ke.getKeyChar();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(message,keyX,keyY);
	}
}