// Write a program to input the marks in three sub and find the sum and average of it..
import java.io.*;
class Marks
{
	public static void main(String sonu[])
	{
	int m1,m2,m3,sum;
	float avg;
	try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value for marks");
		m1=Integer.parseInt(br.readLine());
		m2=Integer.parseInt(br.readLine());
		m3=Integer.parseInt(br.readLine());
		System.out.println("m1=\n"+m1 );
		System.out.println("m2=\n"+m2 );
		System.out.println("m3=\n"+m3 );
		sum=m1+m2+m3;
		System.out.println("The sum of marks="+sum);
		avg=sum/3;
		System.out.println("Average="+avg);
	    }catch(Exception E) {}
    }
}