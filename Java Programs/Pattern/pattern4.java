//// Write program to print the following pattern
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

class pattern4
{
	public static void main(String args[])
	{
		int i,r,j;
		for(i=1, r=5; i<=5; i++ , r--)
		{
			for(j=1;j<=r;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}