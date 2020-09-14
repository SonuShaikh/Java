// Demonstrate use of the Toggle Button
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JToggleButtonDemo extends JApplet{
	JLabel jlab;
	JToggleButton jtbn;
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
			public void run(){
				SonuGUI();
			}
		});
		}catch(Exception e){
			System.out.println("Cant create Bcoz"+e);
		}
	}
	
	public void SonuGUI(){
		jtbn = new JToggleButton("ON/OFF");
		jlab = new JLabel ("Button is OFF");
		setLayout(new FlowLayout());
		
		jtbn.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				if(jtbn.isSelected()){
					jlab.setText("Button is ONN");
				}else{
					jlab.setText("Button is OFF");
				}
			}
		});
		add(jtbn);
		add(jlab);
	}
	
}