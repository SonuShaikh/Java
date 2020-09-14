/*Name: Shaikh Shahabaj
Class: bcs-ii year
 Roll no:74 
 Div:A   */
   
// PROGRAM TO CREATE THE ARRAY OF 10 NUM AND PRINT IT IN ORIGINAL SORTED MANNEER
import java.io.*;
class Arrayeg
{
	public static void main(String sonu[]) 
	{
		int a[]=new int[10];
		int i,j;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the number for the Array");
			for(i=0;i<9;i++)
			{
				a[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Print in Sorted manner");
			for(i=0;i<9;++i)
			{
				for(j=0;j<9;++j)
				{
					if(a[i]<a[j])
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
								
					}
					
				}
				/* System.out.println(a[i]); */
			}
			 for(i=0;i<9;i++)
			  {
			   System.out.println(a[i]);
			   } 
			 
		}catch(Exception e){}
	}
}
/*
[int 15 @ localhost sonu]$javac  Arrayeg.java
[int 15 @ localhost sonu]$java Arrayeg

enter the number foe the Array
5
3
6
8
2
5
9
4
7
Print in Sorted manner
2
3
4
5
5
6
7
8
9
*/