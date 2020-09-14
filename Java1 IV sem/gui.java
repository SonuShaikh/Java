import javax.swing.JOptionPane;
class gui
{
	public static void main(String arg[])
	{ sum=0;
		String fn = JOptionPane.showInputDilog("Enter the first number");
		String sn = JOptionPane.showInputDilog("Enter the second number");
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		sum=num1+num2;
		JOptionPane.showMessageDialog(null,"THe sum is"+sum,"the title",JOptionPane.PLAIN_Message);
		
		
	}
}