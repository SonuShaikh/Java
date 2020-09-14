//Input output Input S
import java.io.*;
class BRRead{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c;
		System.out.println("ENter the 'q' for quite");
		
		do{
			c = (char)br.read();
			System.out.println(c);
		}while(c !='Q' || c != 'q');
	}
}