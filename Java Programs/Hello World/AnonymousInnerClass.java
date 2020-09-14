// Demonstrat Anynomus Innerclass
import java.awt.event.*;
import java.applet.*;
/* public class AnonymousInnerClass extends Applet{
	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent me){
			showStatus("MousePressed");
		}
		}		
		);
	}
} */

public class AnonymousInnerClass extends Applet { 
public void init() { 
setBackground(Color.green);
addMouseListener(new MouseAdapter() { 
public void mousePressed(MouseEvent me) { 
showStatus("Mouse Pressed"); } }); } }
