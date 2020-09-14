// Demonstrate use of the Mulitple list lsection
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class GuiMultilpleSelection extends JFrame{
	private JList leftlist, rightlist;
	private JButton movebtn;
	private static String[] drink = {"Cock", "Cola","Mango Juice", "CockoCola", "Orange", "Bear", "Knouk Out", "Shampion"};
	
	public GuiMultilpleSelection(){
		super("The Title");
		setLayout(new FlowLayout());
		leftlist = new JList(drink);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		leftlist.setToolTipText("Select the Drink to Order");
		add(new JScrollPane(leftlist));
		
		movebtn = new JButton("Move-->");
		movebtn.setToolTipText("PressButtonToMakeOrder");
		movebtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				rightlist.setListData(leftlist.getSelectedValues());
			}
		});
		
		add(movebtn);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(200);
		rightlist.setFixedCellHeight(40);
		rightlist.setToolTipText("Your Order");
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	}
}

class JLists3{
	public static void main(String[] args){
		GuiMultilpleSelection g  = new GuiMultilpleSelection();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(500,200);
		g.setVisible(true);
	}
}