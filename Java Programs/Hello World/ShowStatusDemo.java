// show status window
import java.awt.*;
import java.applet.*;
public class ShowStatusDemo extends Applet{
	String str = "This is the text which appler isn the Applet Windowj";
	
	public void init(){
		setBackground(Color.pink);
		
	}
	public void paint(Graphics g){
		g.drawString(str,10,20);
		showStatus("This Text gone appear on the Showstatus window");
	}
}