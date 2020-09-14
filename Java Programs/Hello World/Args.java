// Draw Args
import java.awt.*;
import java.applet.*;
public class Args extends Applet{
	public void paint(Graphics g){
		g.drawArc(10,40,50,20,0,79);
		g.fillArc(20,50,90,60,0,270);
		g.drawArc(90,80,40,30,0,-170);
		g.fillArc(150,160,70,80,0,300);
	}
}