// adapter demo class 2
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AdapterEx extends Applet
{
	public void init()
	{
		addMouseListener(new MouseAdapterclass(this));
		addMouseMotionListener(new MouseMotionAdapterclass(this));
	}
}
class MouseAdapterclass extends MouseAdapter
{
		String smg = "";
		int mouseX =10, mouseY=20;
		
		AdapterEx param;
		MouseAdapterclass(AdapterEx param)
		{
			this.param = param;
		}
		
		public void mouseClicked(MouseEvent me)
		{
			mouseX = me.getX();
			mouseY = me.getY();
			
			param.showStatus("Mouse Clicked at"+mouseX+ ","+mouseY);
		}
		public void mouseEntered(MouseEvent me)
		{
			mouseX = me.getX();
			mouseY = me.getY();
			
			param.showStatus("Mouse Enterd at"+mouseX+ ","+mouseY);
		}
		public void mouseExited(MouseEvent me)
		{
			mouseX = me.getX();
			mouseY = me.getY();
			
			param.showStatus("Mouse Exited at"+mouseX+ ","+mouseY);
		}
		public void mouseReleased(MouseEvent me)
		{
			mouseX = me.getX();
			mouseY = me.getY();
			
			param.showStatus("Mouse Released at"+mouseX+ ","+mouseY);
		}
		public void mousePressed(MouseEvent me)
		{
			mouseX = me.getX();
			mouseY = me.getY();
			
			param.showStatus("Mouse Presseds at"+mouseX+ ","+mouseY);
		}
}
class MouseMotionAdapterclass extends MouseMotionAdapter
{

		String smg = "";
		int mouseX =10;
		int mouseY=20;
		AdapterEx param;
		public MouseMotionAdapterclass(AdapterEx param)
		{
			this.param = param;
		}
		
		public void mouseDragged(MouseEvent me)
		{
			mouseX = me.getX();
			mouseY = me.getY();
			smg = "*";
			param.showStatus("Mouse Dragging at "+mouseX+ ","+mouseY);
		}
		public void mouseMoved(MouseEvent me)
		{
			mouseX = me.getX();
			mouseY = me.getY();
			
			param.showStatus("Mouse Moving at "+mouseX+ ","+mouseY);
		}
}