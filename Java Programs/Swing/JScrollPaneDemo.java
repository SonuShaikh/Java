 // Demonstrate use of JScrollPane 
 import java.awt.*;
 import javax.swing.*;
 public class JScrollPaneDemo extends JApplet{
	 public void init(){
		 try{
			 SwingUtilities.invokeAndWait(new Runnable(){
				  public void run(){
				  SonuGUI();
			 }
			 });
		 }catch(Exception e){
			 System.out.println("Can't Create Becouse :"+e);
		 }
	 }
	 
	 
	 public void SonuGUI(){
		 JPanel jp = new JPanel();
		 jp.setLayout(new GridLayout(20,20));
		 int b = 0;
		 for(int i =0; i<20; i++){
			 for(int j=0; j<20;j++){
				 jp.add(new JButton("Button"+b));
				 ++b;
			 }
		 }
		 JScrollPane jsp = new JScrollPane(jp);
		add(jsp, BorderLayout.CENTER);
	 }
 }