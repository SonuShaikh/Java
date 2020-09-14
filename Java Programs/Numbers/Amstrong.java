// write program to find Amstrong Nubers
import java.io.*;
class Amstrong
{
	public static void main(String arg[])
	{
		int n, sum=0, temp,r;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
		   System.out.println("Ente the Number to cheak it is Amstrong or not");
            n= Integer.parseInt(br.readLine());
          
		  
				  temp	=n;
                   while(temp != 0)
				   {
					   r=temp%10;
					   sum= (sum+ (r*r*r));
					   temp=temp/10;
				   }
                    
					if(n == sum)
					{
						System.out.println("Enter Number is Amstrong");
					}
					else
					{
						System.out.println("Enter Number is Not Amstrong");
					}
				  
		 
		}catch(Exception e)
		{
			System.out.println("Exception caught : "+e);
		}
		
	}
}