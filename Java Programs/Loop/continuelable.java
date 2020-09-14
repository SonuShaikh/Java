// write program to demonstrate use of the labale countinue
class continuelable
{
	public static void main(String arg[])
	{
		outer : for(int i=1; i<=3; i++)
		{
			inner : for(int j=1; j<=i; j++)
			{
				if(i==j)
				{
					continue outer;
				}
				System.out.println(i+"\t"+j);
			}
		}
	}
}