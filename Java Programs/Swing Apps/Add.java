// Addition of tow Number Swing
import java.io.*;
import javax.swing.JOptionPane;
class Add{
	public static void main(String args[])throws IOException{
		
		try{
			String fn = JOptionPane.showInputDialog("Enter Your First Number");
			int num1 = Integer.parseInt(fn);
			
		    String sn = JOptionPane.showInputDialog("Enter Youe Second Number");
		    int num2 = Integer.parseInt(sn);
		    	
		    int sum = num1+num2; 
		
		JOptionPane.showMessageDialog(null,"The Answer Is "+sum, "Sumation",JOptionPane.PLAIN_MESSAGE);md
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage()+" Is Not a Number");
		}	
			
	}
}