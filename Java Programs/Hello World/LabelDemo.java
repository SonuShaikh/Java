// Demonstrat use of the simple label
import java.awt.*;
import java.applet.*;
public class LabelDemo extends Applet{
	public void init(){
		Label one = new Label("one",Label.CENTER);
		Label two = new Label("two",Label.RIGHT);
		Label three = new Label("three",Label.LEFT);
		
		// Add the lebels
		add(one);
		add(two);
		add(three);
	
	}
	
}