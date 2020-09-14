// write program to print the following pattern
class pattern5
{
	public static void main(String args[])
	{
		int ck=0; 
		int c=2;
		while(c > 0)
		{
			if(ck == 0)
			{
				for(int i=1;i<=5; i++)
				{
					for(int j=1; j<=i;j++)
					{
						System.out.print(j + " ");
					}
					System.out.println();
				}
				ck++;
			}
			else
			{
				for(int i=1, r=5-1; i<=5-1; i++,r--)
				{
					for(int j= 1; j<=r; j++)
					{
						System.out.print(j+ " ");
					}
					System.out.println();
				}
			}
		} c--;
	}
}