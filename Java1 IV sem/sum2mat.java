// Write java program to print sum of two matrix
import java.io.*;
class sum2mat
{
	public static void main(String agr[])
	{
		int mat1[][]=new int[3][3],i,j;
		int mat2[][]=new int[3][3];
		int mat3[][]=new int[3][3];
	  try{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the values for the matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat1[i][j]=Integer.parseInt(br.readLine());
			}	
		}
		 System.out.println("Print the frist mtrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat1[i][j]+"\t");
			}
		 System.out.println(); 
		}
		System.out.println("Enter the values for the mat2");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat2[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Print the mat2 mtrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat2[i][j]+"\t");
			}System.out.println();
		}
		//Additon of matrix
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("Additon of two matrox is as follow");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat3[i][j]+"\t");
			}
			System.out.println();
     	}

	   
    }catch(Exception e){}	
   }
}
/*
Enter the values for the matrix
1
2
3
4
5
6
7
8
9
Print the frist mtrix
1       2       3
4       5       6
7       8       9
Enter the values for the mat2
9
8
7
6
5
4
3
2
1
Print the mat2 mtrix
9       8       7
6       5       4
3       2       1
Additon of two matrox is as follow
10      10      10
10      10      10
10      10      10
*/