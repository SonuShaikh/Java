// Demonstrate use of the JCheckBox
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JCheckBoxes extends JApplet implements ItemListener{
	JLabel jlab;
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					SonuGUI();
				}
			});
		}catch(Exception e){
			System.out.println("Applet Can't Create BCoz "+e);
		}
	}
	
	public void SonuGUI(){
		setLayout(new FlowLayout());
		JCheckBox cb = new JCheckBox("C");
		cb.addItemListener(this);
		add(cb);
		
		cb = new JCheckBox("C++");
		cb.addItemListener(this);
		add(cb);
		
		cb = new JCheckBox("Java");
		cb.addItemListener(this);
		add(cb);
		
		cb = new JCheckBox("Oracle");
		cb.addItemListener(this);
		add(cb);
		
		jlab = new JLabel("Selected Language");
		add(jlab);
		setBackground(Color.cyan);
	}
	
	 public void itemStateChanged(ItemEvent ie){
		 JCheckBox cb = (JCheckBox)ie.getItem();
		 
		 if(cb.isSelected())
			 jlab.setText(cb.getText()+" is Selected");
		 else
			 jlab.setText(cb.getText()+" is Cleared");
	 }
}
