  // static
import java.io.*;
class Usestatic 
{
	public static void main(String arg[])
	{
	try{
		Staticeg obj=new Staticeg();
		Staticeg obj1=new Staticeg();
		Staticeg obj2=new Staticeg();
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		System.out.println("ENter the product id ");
		int id=Integer.parseInt(br.readLine());
		System.out.println("ENter the product name ");
		String s=br.readLine();
		obj.getdata(id,s);
		obj.display();
		int c=Staticeg.getcount();
		System.out.println("Count="+c);
		 
		
	}catch(Exception e){}
}
}    