// Demonstrate use of the JButton
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JButtonDemo extends JApplet implements ActionListener{
	JButton jb;
	JLabel jlab;
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
			public void run(){
				SonuGUI();
			}
		});
		}catch(Exception e){
			System.out.println("Cant Creat Becuse"+e);
		}
	}
	
	public void SonuGUI(){
		ImageIcon add = new ImageIcon("add.png");
		ImageIcon cross = new ImageIcon("cross.png");
		ImageIcon delete = new ImageIcon("delete.png");
		ImageIcon eye = new ImageIcon("eye.png");
		
		setLayout(new FlowLayout());
		
		jb = new JButton(add);
		jb.setActionCommand("Add");
		jb.addActionListener(this);
		add(jb);
		
		jb = new JButton(cross);
		jb.setActionCommand("Cross");
		jb.addActionListener(this);
		add(jb);
		
		jb = new JButton(delete);
		jb.setActionCommand("Delete");
		jb.addActionListener(this);
		add(jb);
		
		jb = new JButton(eye);
		jb.setActionCommand("Eye");
		jb.addActionListener(this);
		add(jb);
		
		// Create lable
		jlab = new JLabel("Choose Operation");
		add(jlab);
	}
	
	//ActionListener
	public void actionPerformed(ActionEvent ae){
		jlab.setText("YOu Have Selected "+ ae.getActionCommand());
	}
}