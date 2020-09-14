// Demonstrate Throw
class ThrowExample
{
	public static void ThrowProg()
	{
		try
		{
			throw new NullPointerException("Demo");
			
		}catch(NullPointerException e)
		{
			System.out.println("Caught inside the ThrowProg ");
		}
	}
	public static void main(String args[])
	{
		try
		{
			
			ThrowProg();
			
		}catch(NullPointerException e)
		{
			System.out.println("Exception Recaught : "+e);
		}
		
	}
}