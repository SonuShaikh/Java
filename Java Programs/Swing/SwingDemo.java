// Demonstrate use of the SampleSwingApplication
import javax.swing.*;
class SwingDemo{
	SwingDemo(){
		// Create a new Jframe Container
		JFrame jfrm = new JFrame("A Sample Swing Application");
		// Give the initial frame size
		jfrm.setSize(270,100);
		
		// Terminat the programe when user close the application
		
		jfrm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		// Create TextBase Label
		JLabel jlab = new JLabel("Swing meance Powerfull GUI");
		jfrm.add(jlab);
		
		// Display the Frame
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args){
		
		// Create the frame on the event dispatching thread
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new SwingDemo();
			}
		});
	}
}