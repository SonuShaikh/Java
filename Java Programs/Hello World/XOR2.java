// Demonstrate XOR
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class XOR2 extends Applet{
	int x,y;
	
	public  XOR2(){
		addMouseMotionListener(new MouseAdapter(){
			public void mouseMoved(MouseEvent me){
				x = me.getX();
				y = me.getY();
				showStatus("MouseMoving at"+x+ ","+y);
				repaint();
			}
			public void mouseDragged(MouseEvent me){
				 x = me.getX();
				 x = me.getY();
				repaint();
				showStatus("MouseDragging at"+x+ ","+y);
				
				
			}
		});
	}
	public void paint(Graphics g){
		// XOR cross hair
		g.setXORMode(Color.black);
		g.setPaintMode();
	}
}