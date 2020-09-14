//Demonstrate use of the ActionListener
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
class ActionFrame extends JFrame{
	JTextField item1,item2,item3;
	JPasswordField passwordField;
	
	public ActionFrame(){
		super("ActionFrame");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(20);
		add(item1);
		
		item2 = new JTextField("Enter Text Here",20);
		add(item2);
		
		item3 = new JTextField("Uneditable TextField",20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass",12);
		add(passwordField);
		
		MyHandler handler = new MyHandler();
		
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	private class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			
			String str = "";
			
			if(ae.getSource() == item1){
				str = String.format("TextField 1 :%s",ae.getActionCommand());
			}else if(ae.getSource() == item2){
				str = String.format("TextField 2 : %s",ae.getActionCommand());
			}else if(ae.getSource() == item3){
				str = String.format("TextField 3 : %s",ae.getActionCommand());
			}else if (ae.getSource() == passwordField){
				str = String.format("passwordField :%s",ae.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null,str);
		}
	}
}

class ActionDemo{
	public static void main(String[] args){
		ActionFrame sonu = new ActionFrame();
		sonu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sonu.setSize(300,150);
		sonu.setVisible(true);
	}
}