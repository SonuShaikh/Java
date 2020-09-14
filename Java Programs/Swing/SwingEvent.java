// Demonstrate Handliing on event in a swing Program
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SwingEvent{
	public  JLabel jlab;
	public SwingEvent(){
		JFrame jfrm = new JFrame("An Event Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(200,90);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Make Two Button
		JButton jbtnAlpha = new JButton("Alpha");
		JButton jbtnBeta = new JButton("Beta");
		
		// add Button to actionListener
		
		jbtnAlpha.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent ae) { 
		jlab.setText("Alpha was pressed."); 
		} 
		});

		
		jbtnBeta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("Alpha Was Pressed");
			}
		});
			jfrm.add(jbtnAlpha);
		jfrm.add(jbtnBeta);
		jlab = new JLabel("Press the Button");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new SwingEvent();
			}
		});
	}
}