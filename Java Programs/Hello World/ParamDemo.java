// Demonstrate use of the param
import java.awt.*;
import java.applet.*;
public class ParamDemo extends Applet{
	String FontName;
	int FontSize;
	Float leading;
	boolean active;
	
	// initioalization
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		
		
		FontName= getParameter("FontName");
		if(FontName==null){
			FontName = "Not Found";
		}
		
	    String param;
		param = getParameter("FontSize");
			try{
				if(param != null)
					FontSize = Integer.parseInt(param);
			    else
					FontSize = 0;
				
			}catch(NumberFormatException e){
				FontSize = -1;
			}
			
			param = getParameter("leading");
			try{
				if(param != null)
					leading = Float.valueOf(param).floatValue();
			}catch(NumberFormatException e){
				FontSize = 1;
			}
			
			param = getParameter("Account");
			if(param != null)
				active = Boolean.valueOf(param).booleanValue();
			
			
	}
	
	
	   public void paint(Graphics g){
				g.drawString("FontName : "+FontName,0,10);
				g.drawString("FontSize : "+FontSize,0,26);
				g.drawString("Leading  : "+leading,0,48);
				g.drawString("Account  : "+active,0,60);
			}
}