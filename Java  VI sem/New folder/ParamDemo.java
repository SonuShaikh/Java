// Parameter Applet
import java.awt.*;
import java.applet.*;
/*
   <applet CODE="ParamDemo" WIDTH="300" HEIGHT = "200">
   <param NAME="String" VALUE="Evining.">
   </applet>
*/
public class ParamDemo extends Applet {
	
	String s;
	
	public void init() {
		s = getParameter("String");
		if(s ==null) {
			s = "Morning";
		}
		 s = "Good "+s;
	}
	public void paint(Graphics g) {
		g.drawString(s,40,40);
	}
}