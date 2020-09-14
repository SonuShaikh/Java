// denonstrate getkeycode() event handler
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KeyCode extends Applet implements KeyListener
{
	String smg="";
	
	public void init()
	{
		addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent ke)
	{
		showStatus("keyPressed");
		int key = ke.getKeyCode();
		
		switch(key)
		{
			case KeyEvent.VK_F1:
		smg += " <F1> ";
		break;
		case KeyEvent.VK_F2:
		smg += " <F2>";
		break;
		case KeyEvent.VK_F3:
		smg += " <F3> ";
		break;
		case KeyEvent.VK_F4:
		smg += " <F4> ";
		break;
		case KeyEvent.VK_F5:
		smg += " <F5>";
		break;
		case KeyEvent.VK_PAGE_DOWN:
		smg+= " PageDown ";
		break;
		case KeyEvent.VK_PAGE_UP:
		smg += "PageUp";
		break;
		case KeyEvent.VK_LEFT:
		smg+= "Left Arrow ";
		break;
		case KeyEvent.VK_RIGHT:
		smg += "Right Arrow";
		break;
		case KeyEvent.VK_UP:
		smg += "Up Arrow";
		break;
		case KeyEvent.VK_DOWN:
		smg += "Down Arrow";
		break;
		
		
		}
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("KeyReleased");
	}
	public void keyTyped(KeyEvent ke)
	{
		showStatus("KeyTyped");
		smg += ke.getKeyChar();
	}
	public void paint(Graphics g)
	{
		g.drawString(smg,10,20);
	}
	
}