// Demonstrate use of the JList
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class JListDemo extends JApplet{
	JList jlist;
	JLabel jlab;
	JScrollPane jsp;
	// Create a Array of String Which Contain the Cities names
	String cities[] = {"Mumbai","Dehli", "Aurangabad", "Nagpur" , "Pune", "Latur", "Mumbai","Dehli", "Aurangabad", "Nagpur" , "Pune", "Latur"};
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					sonuGUI();
				}
			});
		}catch(Exception e){
			System.out.println("Applet Cant Create Becaouse the "+e);
		}
	}
	
	private void sonuGUI(){
		setLayout(new FlowLayout());
		// Create a JList	
		jlist = new JList(cities);
				
		// set List selection mode to single mode
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// set jlist to JScrollPane
		jsp = new JScrollPane(jlist);
		
		// Set PreferredSize of scroll pane
		jsp.setPreferredSize(new Dimension(120,190));
		
		// make lable that display the selection
		
		jlab =new JLabel("Choose a city");
		
		// add listSelectioinlistener ot list 
		jlist.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent ls){
				// get index of change item
				int idx = jlist.getSelectedIndex();
				
				// display the selection if it was selected
				if(idx != -1)
					jlab.setText("CurrentSelection : "+cities[idx]);
				else
					jlab.setText("Choose a city");
				
			}
		});
		
		add(jsp);
		add(jlab);
	}
}