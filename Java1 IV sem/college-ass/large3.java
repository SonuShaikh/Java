// write program to find largest number out of 3 number accept number from user
import java.io.*;
class large3
{
	public static void main(String args[])
	{
	  int num1,num2,num3,l;
	  try{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter two values");
		num1=Integer.parseInt(br.readLine());
		num2=Integer.parseInt(br.readLine());
		num3=Integer.parseInt(br.readLine());
		l=num1;
		if(num2>l)
			l=num2;
		if(num3>l)
			l=num3;
		System.out.println("Largest Number is "+l);
	
	    }catch(Exception e){}
    }
}
/* Enter two values
10
20
30
Largest Number is 30 */