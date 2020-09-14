// Write a program to handle a ArrayIndexOutOfBoundExceptilon
class ArrayIndexOutOfBoundExceptionError
{
	public static void main(String sonu[])
	{
		int a[] = new int[5];
		
		try
		{
			for(int i =0; i<=10; i++)
			{
				a[i]=i;
			}
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}