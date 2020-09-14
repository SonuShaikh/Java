import java.awt.*;
import java.applet.*;
public class SampleApplet2 extends Applet{
	String smg;
	// Initializing init
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		smg= "Inside the init()";
	}
	//intialize the string ot be display()
	public void start(){
		smg += " Insidet the Start()";
	}
	// display the string on appppppplet
	public void paint(Graphics g){
		smg += " Inside the paint()";
		g.drawString(smg,10,30);
	}
	
	
}