// write program to multiplication table
import java.util.*;
class Table
{
  public static void main(String arg[])
  {
	  int n;
	  try
	  {
		  Scanner Scan = new Scanner(System.in);
		  System.out.println("Enter the Number of that Table You Want Print : ");
		  n=Scan.nextInt();
		  for(int i=1; i<=10; i++)
		  {
			  System.out.println(n*i);
		  }
	  }catch (Exception e)
	  {
		  System.out.println("Exception Caught : ");
	  }
	  
  }
}