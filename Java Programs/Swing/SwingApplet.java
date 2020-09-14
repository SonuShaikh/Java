// Create Swing Applet
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingApplet extends JApplet{
	JButton jbtnSonu, jbtnShaikh;
	JLabel jlab;
	
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					 SonuGUI();
				}
			});
		}catch(Exception e){
			System.out.println("JApplet Can't Create becouse"+e);
		}		
	}
	public void SonuGUI(){
		setLayout(new FlowLayout());
		jbtnSonu = new JButton("Sonu");
		jbtnShaikh = new JButton("Shaikh");
		
		jbtnSonu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("YOu Pressed Sonu");
			}
		});
		
		jbtnShaikh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("You have Selected Shaih");
			}
		});
		
		add(jbtnSonu);
		add(jbtnShaikh);
			
		jlab = new JLabel("Press The Button");
		
		add(jlab);
	}
}