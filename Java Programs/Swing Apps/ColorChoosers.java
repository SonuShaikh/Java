// Demonstrae use of the ColorChooser
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ColorDemo extends JFrame{
	
	JPanel panel;
	JButton b;
	private Color color =  (Color.WHITE);
	
	public ColorDemo(){
		super ("The Title");
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		b = new JButton("Choose a Color");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				color = JColorChooser.showDialog(null,"Pick us Your Color",color);
				
				if(color == null){
					color = (Color.WHITE);
				}
				panel.setBackground(color);
			}
		});
		
		add(panel,BorderLayout.CENTER);
		add(b,BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
	}
}

class ColorChoosers{
	public static void main(String[] args){
		ColorDemo d = new ColorDemo();
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}