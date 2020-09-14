import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JCheckBoxes1 extends JApplet implements ItemListener{
	JLabel jlab;
	JCheckBox cb;
	
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
			public void run(){
				SonuGUI();
			}
		});
		}catch(Exception e){}
	}
	public void SonuGUI(){
		setLayout(new FlowLayout());
		cb = new JCheckBox("C");
		cb.addItemListener(this);
		add(cb);	
		
		cb = new JCheckBox("C++");
		cb.addItemListener(this);
		add(cb);
		
		cb = new JCheckBox("Java");
		cb.addItemListener(this);
		add(cb);
		
		jlab = new JLabel("Selected Language");
		add(jlab);
	}
	public void itemStateChanged(ItemEvent ie){
		 JCheckBox cb = (JCheckBox)ie.getItem();
		
		if(cb.isSelected())
			jlab.setText(cb.getText()+" Selected");
		else
			jlab.setText(cb.getText()+" Cleared");
	}
	
}