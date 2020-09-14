// prigram to acept the 10 marks  using array of object and sort it
import java.io.*;
class Stud
{
	
	public static void main(String args[])
	{
	try{
	int marks[];
	marks=new int[10];
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	int l=marks.length, t;
	System.out.println("Enter the marks for 10 student");
	for(i=0;i<l;i++)
		marks[i]=Integer.parseInt(br.readLine());

	// sorting statments
	{
		for(i=0; i<l;i++)
		{
			for(j=0;j<l;j++)
			{
	                   if(marks[i]<marks[j])
	{
		t=marks[i];
		marks[j]=marks[i];
		marks[i]=t;
	}
	System.out.println("Sorted list");
	for(i=0;i<l;i++)
	{
	System.out.println(marks[i]);
	}
	}
	}
	}catch(Exception e){}
	}