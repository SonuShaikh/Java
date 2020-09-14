// Demonstrate use JLIst witih ForgroundColor
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class GuiJLists1 extends JFrame{
	private JList list;
	private JTextField t;
	private static String[] colorname = {"Black","Pink","cyan"};
	private static Color[] colors = {Color.BLACK,Color.PINK,Color.CYAN};
	
	public GuiJLists1(){
		super("Title");
		setLayout(new FlowLayout());
		t = new JTextField("Hello..! I'm Shaikh Sonu");
		t.setToolTipText("This Text Going to Change");
		add(t);
		
		list = new JList(colorname);
		list.setVisibleRowCount(3);
		list.setToolTipText("Choose one Color To change Text of TextField");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		list.addListSelectionListener(new ListSelectionListener(){
			
			public void valueChanged(ListSelectionEvent event){
				//getContentPane().setForeground(colors[list.getSelectedIndex()]);
				t.setForeground(colors[list.getSelectedIndex()]);
			}
		});
	}
}

class JLists2 {
	public static void main(String[] args){
		GuiJLists1 s = new GuiJLists1();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setVisible(true);
		s.setSize(300,200);
	}
}