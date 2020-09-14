// Program to student information By Array of Objects
import java.io.*;
class Student
{
	private String name;
	double persentage;
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
	void getData()
	{
		try
		{
			System.out.println("Enter Your Name");
			name=br.readLine();
			System.out.println("Enter Your Persentage");
			persentage= Double.parseDouble(br.readLine());
			
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
	void display()
	{
		System.out.println(name+ "\t"+persentage);
	}
	
}
class StudentInfo
{
	public static void main(String args[])
	{
		int i;
		Student stud[] = new Student[5];
	  
		
		for(i=0;i<5;i++)
		{
			stud[i]=new Student();
			stud[i].getData();
		}
		
		for(i=0;i<5;i++)
		{
			stud[i].display();
		}
	}
}