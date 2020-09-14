// program to print the number greate than 50 and count it
import java.io.*;
class Counteg
{
	public static void main(String sonu[])
	{ 
	   int a[]= new int[10], count=0, i;
		try{
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Enter the 10 number");
			for(i=0;i<10;i++)
			{
				a[i]=Integer.parseInt(br.readLine());
			}
			System.out.println ( "The number above the 50");
			for(i=0; i<=9;i++)
			
			{
				if(a[i]>50)
				{
					System.out.println(a[i]);
					count=count+1;
				}
			}
			
		}catch(Exception c){}
		System.out.println("Total Count=" +count);
	} 
	  
}/*Enter the 10 number
85
96
56
26
69
85
42
69
56
65
The number above the 50
85
96
56
69
85
69
56
65
Total Count=8*/