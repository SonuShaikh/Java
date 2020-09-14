// demonstrate use of the Paser

import java.io.*;
class ParseDemo
{
	public static void main(String agrs[]) throws IOException
	{
		
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			String str;
			int i;
			int sum = 0;
			System.out.println("Enter the number, 0 to quite");
			do
			{
				str = br.readLine();
				try 
				{				
				    i = Integer.parseInt(str);				   
				}
				catch(NumberFormatException e)
				{
					System.out.println("Exception Caught : "+e);
					i = 0;
				}
				    sum = sum+ i;					
					System.out.println("Current Sum is : "+sum);
				  
			}while(i!=0);
		
	}
}