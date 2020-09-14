// program to exception handling
package Error;
import java.io.*;
class exp extends Exception
{
	exp(int n)
	{
	System.out.println(n+" is an illigle exception");
			}
		 exp(String s)
		 {
		System.out.println(s+" is an illigle exception");
		}
}
class main{
	public static void main(String arg[])
	{
		/*  try{
                BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
                System.out.println("Enter the number");
                int n1=Integer.parseInt(br.readLine());
				System.out.println("Enter the Name:");
				String s1=br.readLine();

		}catch(Exception e)
			{System.out.println("This erroe we got"+e);}  */
			getdata(5,"Anita");
		
		
	}
	public static void trial (int n, String s) throws exp
	{
		if(n==5 )
		{
			throw new exp(n);
		}
		if(s=="Anita")
		{
			throw new exp(s);
		}
			
	}
	public static void getdata(int roll, String name){
		try{
		String Name=name;
		int rollno=roll;
		System.out.println("Rollno is :"+rollno);
		System.out.println("Name of Student is:"+Name);
		trial(rollno,Name);
		}catch(exp e){
			System.out.println(e);
		}
		
	}
}