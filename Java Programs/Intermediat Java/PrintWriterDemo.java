// Demonstrate use of the PrintWriter 
import java.io.*;
class PrintWriterDemo
{
	public static void main(String args[])
	{
		PrintWriter pw = new PrintWriter(System.out,true);
		pw.println("This is the String");
		int a =7;
		pw.print(a);
		double b = a*27.77;
		pw.println(b);
		
	}
}
