// write program to demonstrate use of the labale break
class breaklable
{
	public static void main(String arg[])
	{
		outer : for(int i=0; i<=5;i++)
		{
			inner : for(int j=0; j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
			if(i==3)
			{
				break outer;
			}
		}
	}
}