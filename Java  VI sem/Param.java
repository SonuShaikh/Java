// Parameter
import java.awt.*;
import java.applet.*;
public class Param extends Applet
{
	public String fontName;
	public int fontSize;
	public double leading;
	public boolean active;
	
	public void start()
	{
		String param;
		fontName = getParameter("fontName");
		if(fontName == null)
			fontName = "Not Found";
		param = getParameter("fontSize");
		try{
		if(fontSize != 0)
			fontSize = Integer.parseInt(param);
		else
			fontSize=0;
		}catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
		}
		//fontSize = -1;
		param = getParameter("leading");
		try
		{
			if(param != null)
				leading = Double.parseDouble(param);
			else
				leading = 0;
		}catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
		}
		//leading = -1;
		
		param = getParameter("EnalbleAccount");
		
		
			if(param != null)
				active = Boolean.valueOf(param).booleanValue();
			
				
		
		
		
	}
	
	// display the content
	public void paint(Graphics g)
	{
		g.drawString("Font Name : "+fontName,10,10);
		g.drawString("Font Size : "+fontSize,10,20);
		g.drawString("Leading : "+leading,10,30);
		g.drawString("EnalbleAccount : "+active,10,40);
		
	}
}