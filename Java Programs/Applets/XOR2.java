// XORMode and setPaintMOde
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class XOR2 extends Applet
{
	int chsX = 100,  chsY = 100,x,y;
	public XOR2()
	{
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent me)
			{
				int x = me.getX();
				int y= me.getY();
				chsX = x-10;
				chsY = y-10;
				showStatus("MouseMoving at"+me.getX()+ ","+ me.getY());
				repaint();
				
			}
			public void mouseDragged(MouseEvent me)
			{
				 x = me.getX();
				 y = me.getY();
				 chsX = x-10;
				 chsY = y-10;
				 showStatus("MouseDragging at"+me.getX()+ ","+ me.getY());
				 repaint();
				 
			}
		}
		
		);
	}
	public void paint(Graphics g)
	{
		/*  g.setColor(Color.cyan);
		g.setXORMode(Color.black);  
		g.drawLine(chsX-10, chsY, chsX+10, chsY); 
		g.drawLine(chsX, chsY-10, chsX, chsY+10); 
		g.setPaintMode(); */
		// XOR methos
		 g.setColor(Color.pink);
		g.setXORMode(Color.black);
		g.drawLine(chsX-10,chsY,chsX+10,chsY);
		g.drawLine(chsX,chsY-10,chsX,chsY+10);
		g.setPaintMode(); 
	}
}