// Demonstrate user of the JComboBox
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GuiJComboBox extends JFrame{
	private JComboBox box;
	private JLabel picture;
	private static String[] fileName = {"y.png","x.png"};
	
	private Icon[] pics = {new ImageIcon(getClass().getResource(fileName[0])), new ImageIcon(getClass().getResource(fileName[1]))};
	
	public GuiJComboBox(){
		super("the title");
		setLayout(new FlowLayout());
		box = new JComboBox(fileName);
		box.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				if(ie.getStateChange() == ItemEvent.SELECTED)
					picture.setIcon(pics[box.getSelectedIndex()]);
			}
		});
		
		add(box);
		picture = new JLabel(pics[0]);
		add(picture);
	}
	
}
class JComboBoxs{
	public static void main(String[] args){
		GuiJComboBox s = new GuiJComboBox();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(300,200);
		s.setVisible(true);
	}
}