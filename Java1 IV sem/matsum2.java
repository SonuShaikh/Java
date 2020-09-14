// Write java program to create array of 3x3 matrix print it in matrix form along with the row wise & column wise sum
import java.io.*;
class Arraysum
{
	public static void main(String agr[])
	{
		int mat[][]=new int[3][3],i,j,rw=0;cw=0;
	try{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the values for the matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Print the matrix and sum of matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				rw=rw+mat[i][j];
				cw=cw+mat[j][k];
			}
			k=0;
		}
		System.out.println("Row wise sum="+rw+"column wise sum="+cw);
	}catch(Exception e){}

	}
}	