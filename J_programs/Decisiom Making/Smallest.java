// Accept the two number from command line and pring the smallest use the condition statment
class Smallest
{
	public static void main(String arg[])
	{
	try{
		int num1=Integer.parseInt(arg[0]);// Insert the Value at class file Compiling
		int num2=Integer.parseInt(arg[1]);// Insert the Value at class file Compiling
		if(num1>num2)
		{
			System.out.println(num1+" Is the Greatest Number Among the numbers "+num1+ " And " +num2);
		}
		else
		{
			System.out.println(num2+"Is the Greatest Number Among the "+num1+ " And" +num2);

		}
	  }catch(Exception e){System.out.println("Exception Caugth:"+e);}
	}  
}
/*
 Output:
 C:\Users\sonu\Documents\J_programs\Decisiom Making>javac Smallest.java

C:\Users\sonu\Documents\J_programs\Decisiom Making>java Smallest 15 58
58Is the Greatest Number Among the 15 And58
*/