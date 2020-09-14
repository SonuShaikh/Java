// Demonstrate the use of the keyListener
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KeyEvents extends Applet implements KeyListener {
	String msg = " ";
	int X = 10 , Y = 20;
	
	public void init(){
		addKeyListener(this);
		setBackground(Color.green);
		setForeground(Color.blue);
	}
	// handle keypress
	public void keyPressed(KeyEvent ke){
		showStatus("Key Down");
	}
	// handle keyReleased
	public void keyReleased(KeyEvent ke){
		showStatus("Key Up");
	}
	// handle keyTyped
 	public void keyTyped(KeyEvent ke){
		msg +=ke.getKeyChar();
		repaint();
	} 
	/* public void keyTyped(KeyEvent ke) { 
	     msg += ke.getKeyChar();
         repaint();
       } */

	
	// Didplay thekey char
	public void paint(Graphics g){
		g.drawString(msg,X,Y);
	}
}