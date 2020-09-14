// 
import java.awt.*;
import java.applet.*;
import java.net.*;
public class ACDDemo extends Applet
{
	public void start()
	{
		AppletContext ac = getAppletContext();
		URL url = getCodeBase();
		try
		{
			ac.showDocument(new URL(url+ "index.html"));
		}catch(MalformedURLException e){}
		showStatus("URL Not Found");
	}
}