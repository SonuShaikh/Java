// program to Check the inter charecter is alphabetic or numeric and special charecter
import java.io.*;
class Check
{
	public static void main(String args[])
	{
		try{
		char ch;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		//System.out.println("Enter the Cahracter");
		//ch=(char)br.readLine();
		ch='5';
		if((ch >= 'a') && (ch <= 'z'))
		{
			System.out.println("Charecters In Small Lattes");
		}
		if((ch >= 0) && (ch <=9))
		{
			System.out.println("Numeric ");
		}
		else
		{
			System.out.println("Spicial Charecters");
		}
	}catch(Exception e){}
}
}