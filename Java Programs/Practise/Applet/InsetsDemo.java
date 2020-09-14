// Demonstrae use of the Insets()
import java.awt.*;
import java.applet.*;
public class InsetsDemo extends Applet{
	public void init(){
		setLayout(new BorderLayout());
		
		add(new Button("This is Acros the Top"),BorderLayout.NORTH);
		add(new Label("This is gose to Bottom"),BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.EAST);
		add(new Button("Left"),BorderLayout.WEST);
		
		String smg = "skjfakjfkajfkajfaj";
		add(new TextArea(smg),BorderLayout.CENTER);
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	public Insets getInsets(){
		return new Insets(10,10,10,10); 
	}
}