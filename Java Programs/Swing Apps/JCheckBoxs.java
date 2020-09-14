// Demonstrat JCheckBox
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Gui extends JFrame{
	JTextField t;
	JCheckBox bold,italic;
	
	public Gui(String title){
		super(title);
		setLayout(new FlowLayout());
		t = new JTextField("Hey Whats up Man",30);
		t.setFont(new Font("Serif",Font.PLAIN,14));
		add(t);
		
		bold = new JCheckBox("Bold");
		italic = new JCheckBox("Italic");
		
		add(bold);
		add(italic);
		
		MyHand hand = new MyHand();
		bold.addItemListener(hand);
		italic.addItemListener(hand);
	}
	private class MyHand implements ItemListener{
		public void itemStateChanged(ItemEvent ie){
			Font font = null;
			if(bold.isSelected() && italic.isSelected())
				font = new Font("Serif",Font.BOLD+Font.ITALIC,14);
			else if (bold.isSelected())
				font = new Font ("Serif",Font.BOLD,14);
			else if (italic.isSelected())
				font = new Font("Serif",Font.ITALIC,14);
			else
				font = new Font("Serif",Font.PLAIN,14);
			t.setFont(font);
			
		}
	}
}


class JCheckBoxs {
	public static void main(String args[]){
		Gui s = new Gui("JCheckBox Demo");
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(300,150);
		s.setVisible(true);
	}
}