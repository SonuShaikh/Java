// Demonstrate use of the KeyCode();
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KeyEventsCode extends Applet implements KeyListener{
	String smg= "";
	int X =10, Y =20;
	
	public void init(){
		addKeyListener(this);
		setBackground(Color.green);
		setForeground(Color.blue);
	}
	public void keyPressed(KeyEvent ke){
		showStatus("key Down");
		int key = ke.getKeyCode();
		switch(key){
			case KeyEvent.VK_F1 :
			smg+= "<f1>";
			break;
			
			case KeyEvent.VK_F2 :
			smg+= "<f2>";
			break;
			
			case KeyEvent.VK_F3 :
			smg+= "<f3>";
			break;
			
			case KeyEvent.VK_F4 :
			smg+= "<f4>";
			break;
			
			case KeyEvent.VK_F5 :
			smg+= "<f5>";
			break;
			
			case KeyEvent.VK_F6 :
			smg+= "<f6>";
			break;
			
			case KeyEvent.VK_F7 :
			smg+= "<f7>";
			break;
			
			case KeyEvent.VK_F8 :
			smg+= "<f8>";
			break;
			
			case KeyEvent.VK_F9 :
			smg+= "<f9>";
			break;
			
			case KeyEvent.VK_F10 :
			smg+= "<f10>";
			break;
			
			case KeyEvent.VK_F11 :
			smg+= "<f11>";
			break;
			
			case KeyEvent.VK_F12 :
			smg+= "<f12>";
			break;
			
			case KeyEvent.VK_PAGE_DOWN :
			smg += "Pg dn";
			break;
			
			case KeyEvent.VK_PAGE_UP :
			smg += "Pg up";
			break;
			
			case KeyEvent.VK_LEFT :
			smg += "left Arrow";
			break;
			
			case KeyEvent.VK_RIGHT :
			smg += "right Arrow";
			break;
			
			case KeyEvent.VK_UP :
			smg += "up Arrow";
			break;
			
			case KeyEvent.VK_DOWN :
			smg += "Down Arrow";
			break;		
			
		}
		repaint();
	}
	
	public void keyReleased(KeyEvent ke){
			showStatus("Key Up");
		}
		public void keyTyped(KeyEvent ke){
			smg += ke.getKeyChar();
			repaint();
		}
		public void paint(Graphics g){
			g.drawString(smg,X,Y);
		}
}