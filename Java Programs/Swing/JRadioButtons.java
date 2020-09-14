// Demonstrate use of the RadioButton
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JRadioButtons extends JApplet implements ActionListener{
	JLabel jlab;
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
			public void run(){
				SonuGUI();
			}
		});
		}catch(Exception e){
			System.out.println("Applet cant create becouse "+e);
		}
	}
	
	public void SonuGUI(){
		setLayout(new FlowLayout());
		
		JRadioButton m = new JRadioButton("Male");
		m.addActionListener(this);
		add(m);
		
		JRadioButton f = new JRadioButton("Female");
		f.addActionListener(this);
		add(f);
		
		JRadioButton o = new JRadioButton("Other");
		o.addActionListener(this);
		add(o);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(m);
		bg.add(f);
		bg.add(o);
		
		jlab = new JLabel("Select One");
		add(jlab);
		
	}
	public void actionPerformed(ActionEvent ae){
		jlab.setText("You Are "+ae.getActionCommand());
	}
}