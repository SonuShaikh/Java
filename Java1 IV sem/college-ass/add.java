// write program to add two number accept number from user
import java.io.*;
class add
{
	public static void main(String args[])
	{
	  int num1,num2,sum;
	  try{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter two values");
		num1=Integer.parseInt(br.readLine());
		num2=Integer.parseInt(br.readLine());
		sum=num1+num2;
		System.out.println("The sum is ="+sum);
	    }catch(Exception e){}
    }
}
/* ouput:
Enter two values
50
54
The sum is =104 */