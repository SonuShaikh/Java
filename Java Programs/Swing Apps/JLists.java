// Demonstrate user of the JList
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class GuiJlists extends JFrame{
		
	private JList list;
	private static String[] colorName = {"Black","Green","Cyan", "Pink", "Red", "White"};
	private static Color[] colors = {Color.BLACK,Color.GREEN,Color.CYAN,Color.PINK,Color.RED,Color.WHITE};
	
	public GuiJlists(){
		super("The Title");
		setLayout(new FlowLayout());
		
		list = new JList(colorName);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(new JScrollPane(list));
		
		list.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent event){
				getContentPane().setBackground(colors[list.getSelectedIndex()]);
			}
		});
	}
}

class JLists {
	public static void main(String[] args){
		GuiJlists s = new GuiJlists();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setVisible(true);
		s.setSize(300,200);
	}
}