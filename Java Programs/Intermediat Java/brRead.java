//User the BufferedREader to read the Charactor from the Console read() method
import java.io.*;
class brRead
{
	public static void main(String args[]) throws IOException
	{
		char c ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 'Q' To Exit The Program :");
		
		do
		{
			c = (char) br.read();
			System.out.println(c);
		}while(c!='Q');
			
		System.out.println("End Of The Program");
	}
}