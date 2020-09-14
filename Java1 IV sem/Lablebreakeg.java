class lablebreakeg
{
	public static void main(String sonu[])
	{
		outer: for(int i=1; i<5; i++)
		{
			inner: for(int j=1; j<=i; j++)
			{
				System.out.println(j+"\t");
			}
			System.out.println();
			if(i==3)
			{
				break outer;
			}
		}
	}
}