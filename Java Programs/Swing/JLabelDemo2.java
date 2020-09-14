 import java.awt.*;
 import javax.swing.*;
 public class JLabelDemo2 extends JApplet{
	 public void init(){
		 try{
			 SwingUtilities.invokeAndWait(new Runnable(){
				 public void run(){
					 SonuGUI();
				 }
			 });
		 }catch(Exception e){
			 System.out.println("Can't Create becouse"+e);
		 }
	 }
		
	 private void SonuGUI(){
		 ImageIcon i1 = new ImageIcon("accept.png");
		 ImageIcon i2 = new ImageIcon("add.png");
		 ImageIcon i3 = new ImageIcon("anchor.png");
		 ImageIcon i4 = new ImageIcon("application.png");
		 
		 JLabel l1 = new JLabel("Accept",i1,JLabel.LEFT);
		 JLabel l2 = new JLabel("Add",i2,JLabel.RIGHT);
		 JLabel l3 = new JLabel("Anchor",i3,JLabel.CENTER);
		 JLabel l4 = new JLabel("Application",i4,JLabel.LEADING);
		 
		 add(l1);
		 add(l2);
		 add(l3);
		 add(l4);
	 }
 }