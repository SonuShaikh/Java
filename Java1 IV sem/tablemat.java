 import java.lang.*;	
class tablemat
{
	public static void main(String arg[])
	{
		int i,j,k=2;
		int mat[][]=new int[10][2];
		for(i=0;i<=10;i++)
		{
			for(j=0;j<2;j++)
			{
				mat[j][i]=k*(j+1);
			}
			k=k+1;
		}
	
	System.out.println("2table 3table");
			for(i=0;i<2;i++)
			{
				for(j=0;j<10;j++)
				{
					System.out.print(+mat[i][j]+"\t");
				}
				System.out.println();

	        }
    }
}