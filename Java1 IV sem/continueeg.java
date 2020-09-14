class Continueeg
{
	public static void main(String sonu[])
	{
		int i,j;
		for(i=1; i<=3; i++)
		{
			for(j=1;j<=3;j++)
			{
				if(i==j)
				{
					continue;
				}
				 System.out.println(i+"\t" +j);
			}
		}
	}
}