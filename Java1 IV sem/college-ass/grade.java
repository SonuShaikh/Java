//program to accept the student persent and print the grade of it
import java.io.*;
class grade
{
	public static void main(String sonu[])
	{
		double per;
		try{
			BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Enter the persent of student");
			per=Integer.parseInt(br.readLine());
			if(per>=80)
			{
				System.out.println("A+ Grade");
			}
			else if(per>=70)
			{
				System.out.println("A Grade");
			}
			else if(per>=60)
			{
				System.out.println("B+ Grade");
			}
			else if(per>=50)
			{
				System.out.println("B Grade");
			}
			else if(per>=40)
			{
				System.out.println("c Grade");
			}
			else if(per>35)
			{
				System.out.println("D Grade");
			}
			else
			{
				System.out.println(" FAILE");
			}
		}catch(Exception e){}
	}
}
/* Enter the persent of student
90
A+ Grade */