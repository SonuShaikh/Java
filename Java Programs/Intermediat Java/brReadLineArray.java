// Inter the line of arry to make a texteditor
import java.io.*;
class brReadLineArray
{
	public static void main(String args[]) throws IOException
	{
		String str[] = new String[100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the text of line");
		System.out.println("ENter the 'stop' to Exit the Program ");
		
		for(int i=0; i<100; i++)
		{
			str[i]=br.readLine();
			
			if(str[i].equals("stop"))
				break;
			
			
		}
		System.out.println("Here is the Content of your Arrays");
		for(int i=0;i<100; i++)
		{
			if(str[i].equals("stop"))
				break;
			System.out.println(str[i]);
		}
	}
}
