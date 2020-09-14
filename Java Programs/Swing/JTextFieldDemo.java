// demonstrate use of JTextFeild
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JTextFieldDemo extends JApplet{
	JTextField t1,t2,t3;;
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
			public void run(){
				SonuGUI();
			}
		});
		}catch(Exception e){
			System.out.println("Cant Create Becouse"+e);
		}
		setBackground(Color.cyan);
	}
	
	private void SonuGUI(){
		setLayout(new FlowLayout());
		t1 = new JTextField(10);
		t2 = new JTextField("Name",10);	
		t3 = new JTextField("What You Want??");
		
		add(t1);
		add(t2);
		add(t3);
	}
}