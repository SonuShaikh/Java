class SuperSubCatch
{
	public static void main(String args[])
	{
		
		try
		{
			
			int a = 0;
		    int b = 10/a;
			System.out.println("b="+b);
		
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Devide by Zero Exception");
		}
	}
}