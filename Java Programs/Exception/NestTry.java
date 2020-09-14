// Nested Try Example 
class NestTry
{
    public static void main(String args[])
	{
		try
		{
			int a = args.length;
			int b= 10/a;
			System.out.println("b= "+b);
			
			try
			{
				if(a==1)
					a=a/(a-a);
				System.out.println("a="+a);
				if(a==2){
			int c[]={12};
		        c[88]=99;}
			}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException : "+e);
		}
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception :"+e);
		}
	}
}