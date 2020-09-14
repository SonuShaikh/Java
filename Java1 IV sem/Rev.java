// programm in java to create the arry of n number and print in revers accesstion
import java.lang.*;
import java.io.*;
class Rev
{
	public static void main(String sonu[])
	{
		
		int i,j,n;
		try
		{
			BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter the values for n");
			n=Integer.parseInt(br.readLine());
			int a[]=new int[n];
			System.out.println("Enter "+n+" number for array of elements");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(br.readLine());
			}
		
			System.out.println("Print in revers oder");
			for(j=(n-1);j>=0;j--)
			{
				System.out.println(a[j]);
			}
		}catch(Exception e){}
	}
}