import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LogInDemo extends JFrame{
		private JTextField UserName,UserPass;
		private JButton Submit;
		private JLabel Uname,Upass,UP;
		private JPanel MousePanel;
		
		
		public LogInDemo(String title){
			super(title);
			MousePanel = new JPanel();
			MousePanel.setBackground(Color.CYAN);
			add(MousePanel,BorderLayout.CENTER);
			setLayout(new FlowLayout());
			UserName = new JTextField(10);
			UserName.setToolTipText("It Should be less Than 15 char");
			UserPass= new JTextField(10);
			//UserPass.setEchoChar('*');
			UserPass.setToolTipText("Don't Forget Your Password");
			
			Uname = new JLabel("User Name : ");
			Upass = new JLabel("PassWord : ");
			UP = new JLabel("H");
			
			Submit = new JButton("Log In");
			Submit.setToolTipText("Click To Log in");
			
			add(Uname);
			add(UserName);
			add(Upass);
			add(UserPass);
			add(UP);
			add(Submit);
			MyMouseMotion Hand = new MyMouseMotion();
			Submit.addMouseListner(Hand);
			
		}
		
	private class MyMouseMotion extends MouseMotionAdapter{
		public void mouseClicked(MouseEvent me){
			UP.setText(UserName.getText());
		}
	}	
}

class LogIn{
	public static void main(String args[]){
		LogInDemo obj = new LogInDemo("Log In Form");
		
				obj.setVisible(true);
		obj.setSize(250,150);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}