// program to create array of elment for 10 element of integer type find on excepted number is present in array or not
import java.io.*;
class searching
{
	public static void main(String sonu[])
	{
	int i; 
	boolean isfound=false;
	try{
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	int a[]=new int[10];
	System.out.println("Enter the value for array");
	for(i=0;i<=9;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("Enter the number to search:");
	int n=Integer.parseInt(br.readLine());
	for(i=0;i<=9;i++)
	{
		if(a[i]==n)
		isfound=true;
	 
	}
	{
	if(isfound=true)
	{
		System.out.println("the number "+n+" is found"); 
	}
     else
	{
		System.out.println("The number is not found");
	}
	
	}
}catch(Exception e){}
}
}