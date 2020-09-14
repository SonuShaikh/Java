// Demonstrate Inner class
import java.awt.event.*;
import java.applet.*;
public class InnerClassDemo extends Applet{
	public void init(){
		addMouseListener(new MyMouseAdapter2());
		
	}
	class MyMouseAdapter2 extends MouseAdapter{
		public void mousePressed(MouseEvent me){
			showStatus("MousePressed");
		}
	}
}