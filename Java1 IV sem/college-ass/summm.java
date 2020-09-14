import java.io.*;
import java.lang.*;
class summm
{
public static void main(String args[])
{
	int n,sum=0;
	char ans='Y';
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try
	{
	System.out.flush();
	do
	{
		System.out.println("\n\tEnter the numbers");
		n=Integer.parseInt(br.readLine());
		sum=sum+n;
		System.out.println("Enter Y/N");
		
		ans=(char)System.in.read();
		if(ans=='Y')
                    continue;
		else
                   break; 
	}while(ans=='Y');
	System.out.println("\n\tSum is "+sum);
	}
	catch(Exception e)
	{}
}
}
    /*   Enter the numbers
1
Enter Y/N
Y2

        Enter the numbers
Enter Y/N
Y3

        Enter the numbers
Enter Y/N
Y4

        Enter the numbers
Enter Y/N
Y5

        Enter the numbers
Enter Y/N
N

        Sum is 15 */
		