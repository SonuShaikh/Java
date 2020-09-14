import java.io.*;
import java.lang.*;
class matsum
{
	public static void main(String arg[])
	{ 
	  int a[][]=new int[3][3],i,j,sum=0;
		try
		{
			BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter the values for the matArray");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(br.readLine());
				}
			}
			System.out.println("Print the sum");
           for(i=0;i<3;i++)
		   {
			   for(j=0;j<3;j++)
			   {
				   sum=sum+a[i][j];
			   }
		   }			   
		System.out.println(+sum+" Is the sum of matrix");
		}catch(Exception e){}
	}
}