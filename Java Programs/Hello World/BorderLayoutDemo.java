// demonstrate user of the BorderLayout
import java.awt.*;
import java.applet.*;
import java.util.*;
public class BorderLayoutDemo extends Applet {
	public void init(){
		setLayout(new BorderLayout(5,5));
		add(new Button("This is the Top"),BorderLayout.NORTH);
		add(new Label("The footer Masage goes to here"),BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.WEST);
		add(new Button("Left"),BorderLayout.EAST);
		
		String msg = "The reasonable man adapts " + 
		"himself to the world;\n" + 
		"the unreasonable one persists in " + 
		"trying to adapt the world to himself.\n" + 
		"Therefore all progress depends " + 
		"on the unreasonable man.\n\n" + 
		"        - George Bernard Shaw\n\n";
		
		add(new TextArea(msg),BorderLayout.CENTER);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
}