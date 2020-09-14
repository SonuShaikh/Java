// fahrenheit to Celsius (Formula : temp= (temp-32)*5/9;
import java.util.*;
class TempConversion
{
	public static void main(String args[])
	{
	  double temp;
	  try{
	  Scanner Scan = new Scanner(System.in);
	  System.out.println("Enter The Tempreture : ");
	  temp= Scan.nextDouble();
	  
	  temp=(temp-32)*5/9;
	  System.out.println(" fahrenheit Is Equal To : "+temp);
	
	  }catch(Exception e)
	  {
		  System.out.println(" Exception Caught :  "+e);
	  }
	}
}
