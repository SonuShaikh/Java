// Simple Applet
import java.awt.*;
import java.applet.*;
/*
   <applet CODE="SimpleApplet" WIDTH="300" HEIGHT = "200">
   </applet>
*/
public class SimpleApplet extends Applet {
	public void paint(Graphics g) {
		g.drawString("First Java Applet.",50,50);
	}
}   