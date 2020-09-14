// draw the Polygone
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Polygone extends Applet
{
	public void paint(Graphics g)
	{
		int xpoints[] = {30, 200, 30, 200, 30}; 
		int ypoints[] = {30, 30, 200, 200, 30}; 
		
		
		
		int num = 5;
		g.fillPolygon(xpoints,ypoints,num);
		
	}
}