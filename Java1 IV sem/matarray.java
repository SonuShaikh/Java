import java.io.*;
class matarray
{
	public static void main(String sonu[])
	{
		int mat[][]= new int[3][3];
		int i,j;
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the value for the Matrix array");
			for( i=0;i<3;i++)
			{
				for( j=0;j<3;j++)
				{
					mat[i][j]=Integer.parseInt(br.readLine());
			
			    }
			}
			System.out.println("Print the array of matrix");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(+mat[i][j]+"\t");
				}
				System.out.println();
			}
		}catch(Exception e){}
	}
}