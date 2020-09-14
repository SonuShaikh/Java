// Demonstrate use of the JLabel and ImageIcon
import java.awt.*;
import javax.swing.*;
public class JLabelDemo extends JApplet{
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					SonuGUI();
				}
			});
		}catch(Exception e){
			System.out.println("Cant Creaet becouse"+e);
		}
	}
	
	private void SonuGUI(){
		// Create a and icom
		ImageIcon ii = new ImageIcon("arrow_inout.png");
		JLabel j1 = new JLabel(ii,JLabel.LEFT);
		
		add(j1);
	}
}