import java.io.*;
import java.lang.*;
class Do
{
public static void main(String args[])
{
	int n,s=0;
	char ans='Y';
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try
	{
	System.out.flush();
	do
	{
		System.out.println("\n\tEnter the numbers");
		n=Integer.parseInt(br.readLine());
		s=s+n;
		System.out.println("Enter Y/N");
		
		ans=(char)System.in.read();
		if(ans=='Y')
                    continue;
		else
                   break; 
	}while(ans=='Y');
	System.out.println("\n\tSum is "+s);
	}
	catch(Exception e)
	{}
}
}
		