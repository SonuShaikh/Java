// program to sum of the number until user say no
import java.io.*;
class sum2
{
	public static void main(String sonu[])
	{
		int n,sum=0;
		char ch='y';
		try{
			BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Enter the numbers to be Add");
			do
			{
				System.out.flush();
				n=Integer.parseInt(br.readLine());
				sum=sum+n;
				System.out.println("Enter n to stop");
				ch=("char")System.in.read();
			
				
			}while(ch!='n');
			System.out.println("Sum is ="+sum);
		   }catch(Exception e){}
	}
}
/* 1
2
3
4
5
6
7
8
9
0
Sum is =45 */