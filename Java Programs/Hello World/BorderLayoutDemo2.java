// Demonstrate use of the BorderLayout
import java.awt.*;
import java.applet.*;
import java.util.*;
public class BorderLayoutDemo2 extends Applet {
	public void init(){
		String msg = "";
		setLayout(new BorderLayout());
		add(new Button("This is the top of "),BorderLayout.NORTH);
		add(new Label("This goes to Footer "),BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.EAST);
		add(new Button("Left"),BorderLayout.WEST);
		
		msg = "Hello This is the Shaikh Shahabaj \n"+
		         "Who Are you..??? \n"+
				 "Hello I'm Sonu..  Can Speek with Mr.Shaikh ;\n"+
				 "Yes Offcourse, you do...\n"+
				 "Thank YOu Somuch";
				 
		add(new TextArea(msg),BorderLayout.CENTER);
	}
}