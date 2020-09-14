// write program to demonstrate use of the continue lable
class continueeg
{
	public static void main(String arg[])
	{
		int i,j;
		for(i=0; i<=5;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(i==j)
				{
					continue ;
				}
				System.out.println(i+"\t"+ j);
			}
		}
	}
}