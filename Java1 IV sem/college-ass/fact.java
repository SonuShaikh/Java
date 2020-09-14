// Factorial of number using for loop
import java.io.*;
class fact
{
  public static void main(String sonu[])
  {    int n=10,fact=1,i;
	 /*   try{
		  BufferedReader br=new BufferedReader(new InputStreamReader (System.in));*/
	    System.out.println("Enter the value for n");
		//n=Integer.parseInt(br.readLine());
	  for(i=1;i<=n;i++)
	  {
		  fact=fact*i;
		  System.out.println("Fact of "+i+" is "+fact);
	  }
	  System.out.println("Factorial of "+n+" number is "+fact);
  //}catch(Exception e){}
}
}
/* Enter the value for n
Fact of 1 is 1
Fact of 2 is 2
Fact of 3 is 6
Fact of 4 is 24
Fact of 5 is 120
Fact of 6 is 720
Fact of 7 is 5040
Fact of 8 is 40320
Fact of 9 is 362880
Fact of 10 is 3628800
Factorial of 10 number is 3628800 */