//JButton
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUI extends JFrame{
	
	JButton b1,custom;
	public GUI(String title){
		super(title);
		setLayout(new FlowLayout());
		
		b1 = new JButton("Hello");
		add(b1);
		
		Icon x = new ImageIcon("x.png");
		Icon y = new ImageIcon("y.png");
		custom = new JButton("Custom",x);
		custom.setRolloverIcon(y);
		add(custom);
		
		handler handle = new handler();
		
		b1.addActionListener(handle);
		custom.addActionListener(handle);
	}
	
	private class handler implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			JOptionPane.showMessageDialog(null,String.format("%s",ae.getActionCommand()));
		}
	}
}
class JButtons{
	public static void main(String arg[]){
		GUI sonu = new GUI("HelloHey");
		sonu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sonu.setSize(300,200);
		sonu.setVisible(true);
	}
}