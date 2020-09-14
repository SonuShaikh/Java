// De
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SwingEventDemo{
	JLabel jlab;
	public SwingEventDemo(){
		JFrame jfrm = new JFrame("Siwing Event");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(200,100);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnSonu = new JButton("Sonu");
		JButton btnShaikh = new JButton("Shaikh");
		
		
		btnSonu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("You Pressed Sonu");
			}
		});
		
		btnShaikh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("You Pressed shaikh");
			}
		});
		
		// add button
		jfrm.add(btnSonu);
		jfrm.add(btnShaikh);
		jlab = new JLabel("Press Button");
		
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
		    public void run(){
				 new SwingEventDemo();
			}
		});
	}
}