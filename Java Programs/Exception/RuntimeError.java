//basic example of the 
class RuntimeError
{
	public static void main(String args[])
	{
		int a=10; 
		int b=0;
		int c, d;
		 try
		 {
			 c = a/b;
			 System.out.println("C = "+c);
		 }catch(Exception e)
		 {
			 System.out.println("Exception Caught : "+e);
		 }
		 
		 d= a/5;
		 System.out.println("D = "+d);
	}
}