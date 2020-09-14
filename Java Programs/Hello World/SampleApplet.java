import java.awt.*;
import java.applet.*;
public class SampleApplet extends Applet{
	String smg;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		smg = "In side the init() -- ";
	}
	// Initialize the String to be display
	public void start(){
		smg +=" Inside the Start()";
	}
	// display message in Appplet window
	public void paint(Graphics g){
		smg += " Inside the paint of Method";
		g.drawString(smg,10,30);
	}
}