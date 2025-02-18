// Demonstrate use of the DoubleBuffer
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class DoubleBuffer extends Applet{
	int gap = 3;
	int mx,my;
	boolean flicker = true;
	int w,h;
	Image buffer = null;
	
	public void init(){
		Dimension d = getSize();
		w = d.width;
		h = d.height;
		buffer = createImage(w,h);
		
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent me){
				mx = me.getX();
				mx = me.getY();
				flicker = false;
				repaint();
			}
			
			public void mouseMoved(MouseEvent me){
				mx = me.getX();
				my = me.getY();
				flicker = true;
				repaint();
			}
		});
	}
	public void paint(Graphics g){
		Graphics screenge = null;
		if(!flicker){
			screenge = g;
			g =buffer.getGraphics();
		}
		g.setColor(Color.blue);
		g.fillRect(0,0,w,h);
		
		g.setColor(Color.red);
		for(int i =0; i< w; i +=gap)
			g.drawLine(i,0,w-i,h);
		for(int i =0 ;i<h; i +=gap)
			g.drawLine(i,0,w,h-i);
		
		g.setColor(Color.black);
		g.drawString("Press Mouse Button to Double Buffer",10,h/2);
		
		g.setColor(Color.yellow);
		g.fillOval(mx-gap,my-gap,gap*2+1,gap*2+1);
		
		if(!flicker){
			screenge.drawImage(buffer,0,0,null);
		}
	}
	public void update(Graphics g){
		paint(g);
	}
}