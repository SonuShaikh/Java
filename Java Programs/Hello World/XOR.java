// Demonstrate XOR
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class XOR extends Applet{
	int chsX = 100, chsY = 100;
	public XOR(){
		addMouseMotionListener(new MouseAdapter(){
			public void mouseMoved(MouseEvent me){
				int x = me.getX();
				int y = me.getY();
				chsX = x-10;
				chsY = y-10;
				showStatus("Mouse Moving at "+x+ ","+y);
				repaint();
			}
		});
	}
	
	public void paint(Graphics g){
		Color c1 = new Color(255,100,100);
		Color c2 = new Color(100,255,100);
		Color c3 = new Color(100,100,255);
		
		g.setColor(c1);
		g.drawLine(0,0,100,100);
		g.drawLine(0,100,100,0);
		
		g.setColor(c2);
		g.drawLine(40,25,250,180);
		g.drawLine(75,90,400,400);
		
		g.setColor(c3);
		g.drawLine(20,150,400,40);
		g.drawLine(5,290,80,19);
		
		g.setColor(Color.red);
		g.drawOval(10,10,50,50);
		g.fillOval(70,90,140,100);
		
		g.setColor(Color.blue);
		g.drawOval(190,10,90,30);
		g.drawRect(10,10,60,50);
		
		g.setColor(Color.cyan);
		g.fillRect(100,10,60,50);
		g.drawRoundRect(190,10,60,50,15,15);
		
		// XOR cross hair
		g.setXORMode(Color.pink);
		g.drawLine(chsX-10,chsY,chsX+10,chsY);
		g.drawLine(chsX,chsY-10,chsX,chsY+10);
		g.setPaintMode();
	}
} 