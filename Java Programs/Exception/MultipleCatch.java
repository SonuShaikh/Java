// Demonstrate use of the mutliple catch block
class MultipleCatch
{
	public static void main(String args[])
	{
		try{
		int a= args.length;
		System.out.println("a = "+a);
		int b=42/a;
		System.out.println("b= "+b);
		int c[]={12};
		c[33]=42;
		System.out.println("c[32]"+c[32]);
		}catch(ArithmeticException e)
		{
			System.out.println("Devide By Zero Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of Range");
		}
		System.out.println("After The catch Block");
	}
}