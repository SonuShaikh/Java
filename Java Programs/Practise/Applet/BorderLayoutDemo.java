// Demonstrate BorderLayout
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class BorderLayoutDemo extends Applet{
	public void init(){
		setLayout(new BorderLayout());
		add(new Button("This is the Across the Top"),BorderLayout.NORTH);
		add(new Label("This goes to Bottom"),BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.EAST);
		add(new Button("Left"),BorderLayout.WEST);
		
		String smg = "Hello My Name is \n"+
		            "Shaikh Shahabaj Mubarak";
					
		add(new TextArea(smg),BorderLayout.CENTER);			
	}
}