// prime number
import java.io.*;
class prime
{
     public static void main(String sonu[])
	 {	 int num,i, flag=0;
	 try
	 {
		 BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		 System.out.println("Enter the any number");
		 num=Integer.parseInt(br.readLine());
		 for( i=2;i<=num;i++)
		 {
			 if(num%i==0)
			 { 
				 flag=flag+1;
				 break;
			 }
			 i++;
		 }
		 if(num==i)
		 {
			 System.out.println("The number "+num+" is prime");
		 }
		 else
		 {
			 System.out.println("The number "+num+" is  not prime");
		 }
			 
	 }  
	    catch(Exception e){}
}
}