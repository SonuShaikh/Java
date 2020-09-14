import java.io.*;
class Usefact
{
	public static void main(String arg[])
	{
		Factorial obj=new Factorial();
      try
	  {
		 /*  BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		  System.out.println("Enter the number for the factorials");
		  int j=Integer.parseInt(br.readLine()); */
		  
		  obj.fact(5);
		  obj.getfact();
		  System.out.println();
	  }catch(Exception e){}
	}
}