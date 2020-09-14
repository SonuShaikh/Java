// Write program to input two numbe and check weather it is the even or Odd
import java.io.*;
class EvenOdd
{
	public static void main(String arg[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter The First Number : ");
			int num1=Integer.parseInt(br.readLine());
			System.out.println("Enter The Second Number : ");
			int num2 = Integer.parseInt(br.readLine());
			System.out.println("The Addition of "+num1+ " And "+num2+" is : "+(num1+num2));
		}catch(Exception e){
			
			System.out.println("Exception Caugth: "+e);
		}
	}
}