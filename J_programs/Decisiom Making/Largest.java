// Accept the Three number from command line and pring the Largest use the Nested if statment
class Largest
{
	public static void main(String arg[])
	{
	try{
		int num1=Integer.parseInt(arg[0]);// Insert the Value at class file Compiling
		int num2=Integer.parseInt(arg[1]);// Insert the Value at class file Compiling
		int num3=Integer.parseInt(arg[2]);// Insert the Value at class file Compiling
		if(num1>num2)
		{
			if(num1>num3)
			{
			System.out.println(num1+" Is the Greatest Number Among the numbers "+num1+ " And" +num2+ " And" +num3);
			
			}
		if(num2>num3)
	
		{
			System.out.println(num2+"Is the Greatest Number Among the "+num1+ " And" +num2+ " And" +num3);

		}
		else
		{
			System.out.println(num3+"Is the Greatest Number Among the "+num1+ " And" +num2+ " And" +num3);
		}
	  }
	}catch(Exception e){System.out.println("Exception Caugth:"+e);}  
}
}
