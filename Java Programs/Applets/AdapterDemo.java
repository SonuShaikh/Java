// Adaptor class demo
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AdapterDemo extends Applet
{
         public void init()
		 {
			 addMouseListener(new MyMouseAdapter (this));
			 addMouseMotionListener(new YouMouseMotionAdapter(this));
		 }		 
		 
} 
 class MyMouseAdapter extends MouseAdapter
{
	AdapterDemo adapterdemo;
	public MyMouseAdapter(AdapterDemo adapterdemo)
	{
		this.adapterdemo=adapterdemo;
	}
	public void mouseClicked(MouseEvent me)
	{
		adapterdemo.showStatus("mouseClicke");
	}
	public void mouseReleased(MouseEvent me)
	{
		adapterdemo.showStatus("MOuseReleased");
	}
	public void mouseEntered(MouseEvent me)
	{
		adapterdemo.showStatus("Mouse Entered");
	}
}
class YouMouseMotionAdapter extends MouseMotionAdapter
{
	int mouseX=10;
	int mouseY =20;
	AdapterDemo adapterdemo;
	public YouMouseMotionAdapter(AdapterDemo adapterdemo)
	{
		this.adapterdemo= adapterdemo;
	}
	public void mouseDragged(MouseEvent me)
	{
		adapterdemo.showStatus("Mouse Dragged");
	}
	public void mouseMoved(MouseEvent me)
	{
	     mouseX = me.getX();
		 mouseY = me.getY();
		 adapterdemo.showStatus("Mouse Moved at "+me.getX()+","+me.getY());
	}
}