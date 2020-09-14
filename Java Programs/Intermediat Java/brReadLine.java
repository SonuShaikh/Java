// ReadLine()
import java.io.*;
class brReadLine
{
	public static void main(String args[]) throws IOException
	{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Line Of the String : ");
		System.out.println("Enter 'stop' to Queit The Program : ");
		do
		{
			str = br.readLine();
			System.out.println(str);
		}while(!str.equals("stop"));
	}
}