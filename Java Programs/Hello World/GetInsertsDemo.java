// Demonstrate use of the Insets and getInset() Method and object
import java.awt.*;
import java.applet.*;
import java.util.*;
public class GetInsertsDemo extends Applet{
	public void init(){
		setBackground(Color.cyan);
		setLayout(new BorderLayout());
		add(new Button("This suppose to Top"),BorderLayout.NORTH);
		add(new Label("This Gose to Botton"), BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.EAST);
		add(new Button("Left"),BorderLayout.WEST);
		
		String msg = "Hello This is the Shaikh Shahabaj \n"+
		         "Who Are you..??? \n"+
				 "Hello I'm Sonu..  Can Speek with Mr.Shaikh ;\n"+
				 "Yes Offcourse, you do...\n"+
				 "Thank YOu Somuch";
		add(new TextArea(msg),BorderLayout.CENTER);
	}
	public Insets getInsets(){
		return new Insets(10,10,10,10);
	}
}