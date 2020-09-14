//Demonstrate use of the Adapter class
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AdapterDemo extends Applet{
	public void init(){
		
		
		addMouseListener(new MyMouseAdapter(this)); 
		addMouseMotionListener(new MyMouseMotionAdapter(this));

	}
}
class MyMouseAdapter extends MouseAdapter{
	AdapterDemo AD;
	public MyMouseAdapter(AdapterDemo ad){
		AD = ad;
	}
	// Handle Mouse Clicke event

	public void mouseClicked(MouseEvent me){
		AD.showStatus("MouseClicked");
	}
}
class MyMouseMotionAdapter extends MouseMotionAdapter{
	AdapterDemo AD;
	
	public MyMouseMotionAdapter(AdapterDemo ad){
		AD=ad;
	}
	// Handle Mouse Dragged Event
	public void mouseDragged(MouseEvent me){
		AD.showStatus("Mouse Dragged ");
	}
}